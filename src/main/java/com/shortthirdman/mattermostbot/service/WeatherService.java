package com.shortthirdman.mattermostbot.service;

import com.shortthirdman.mattermostbot.adapter.OpenWeatherMapClient;
import com.shortthirdman.mattermostbot.model.WeatherData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final OpenWeatherMapClient openWeatherMapClient;

    @Value("${openweather.api-key}")
    private String apiKey;

    public WeatherData getWeatherData(String country, String city) {
        return openWeatherMapClient.getWeatherData(
                String.format("%s,%s", city, country),
                apiKey,
                "metric"
        );
    }
}
