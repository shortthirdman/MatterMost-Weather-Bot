package com.shortthirdman.mattermostbot.controller;

import com.shortthirdman.mattermostbot.model.WeatherData;
import com.shortthirdman.mattermostbot.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherData getWeather(
            @RequestParam(name = "city") String city,
            @RequestParam(name = "country") String country
    ) {
        return weatherService.getWeatherData(country, city);
    }
}
