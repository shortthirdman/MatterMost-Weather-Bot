package com.shortthirdman.mattermostbot.adapter;

import com.shortthirdman.mattermostbot.model.WeatherData;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface OpenWeatherMapClient {

    @GetExchange
    WeatherData getWeatherData(
            @RequestParam(name = "q") String countryAndCity,
            @RequestParam(name = "appid") String apiKey,
            @RequestParam(name = "units") String units
    );
}
