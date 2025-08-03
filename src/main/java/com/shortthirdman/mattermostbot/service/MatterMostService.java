package com.shortthirdman.mattermostbot.service;

import com.shortthirdman.mattermostbot.adapter.MatterMostBotClient;
import com.shortthirdman.mattermostbot.model.Message;
import com.shortthirdman.mattermostbot.model.WeatherData;
import com.shortthirdman.mattermostbot.model.WeatherIcon;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatterMostService {

    private final MatterMostBotClient matterMostBotClient;
    private final WeatherService weatherService;

    @Value("${mattermost.webhook.username:Weather Bot}")
    private String botUserName;

    @Value("${mattermost.city:London}")
    private String city;

    @Value("${mattermost.country:England}")
    private String country;

    public void sendMessage(Message message) {
        message.setUsername(botUserName);
        matterMostBotClient.sendMessage(message);
    }

    public void postWeather() {
        WeatherData weatherData = weatherService.getWeatherData(city, country);
        Message message = new Message();
        message.setUsername(botUserName);
        message.setText(formatWeatherMessage(weatherData));
        message.setChannel("town-square");
        matterMostBotClient.sendMessage(message);
    }

    @Scheduled(cron = "${mattermost.bot.cron}")
    public void postWeatherUpdate() {
        WeatherData weatherData = weatherService.getWeatherData(city, country);
        Message message = new Message();
        message.setUsername(botUserName);
        message.setText(formatWeatherMessage(weatherData));
        message.setChannel("town-square");
        message.setIconEmoji(WeatherIcon.fromCondition(weatherData.getWeather().getFirst().getDescription()).getEmoji());
        matterMostBotClient.sendMessage(message);
    }

    private String formatWeatherMessage(WeatherData weather) {
        return String.format("""
            ### Daily Weather Update
            
            **Location:** %s, %s
            **Temperature:** %.1f°C
            **Feels Like:** %.1f°C
            **Condition:** %s
            **Humidity:** %d%%
            **Wind:** %.1f m/s
            
            Have a great day!
            """,
                city,
                country,
                weather.getMain().getTemp(),
                weather.getMain().getFeelsLike(),
                weather.getWeather().getFirst().getDescription(),
                weather.getMain().getHumidity(),
                weather.getWind().getSpeed()
        );
    }
}
