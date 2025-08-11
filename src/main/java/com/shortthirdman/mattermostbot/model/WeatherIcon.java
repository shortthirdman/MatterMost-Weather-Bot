package com.shortthirdman.mattermostbot.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum WeatherIcon {

    SUNNY(":sunny:", Arrays.asList("clear sky", "clear")),
    PARTLY_CLOUDY(":partly_sunny:", Arrays.asList("few clouds", "scattered clouds")),
    CLOUDY(":cloud:", Arrays.asList("broken clouds", "overcast clouds")),
    RAINY(":rain_cloud:", Arrays.asList("rain", "light rain", "moderate rain", "heavy rain", "shower rain")),
    THUNDERSTORM(":thunder_cloud_rain:", Arrays.asList("thunderstorm", "thunder")),
    SNOWY(":snowflake:", Arrays.asList("snow", "light snow", "heavy snow")),
    FOGGY(":fog:", Arrays.asList("mist", "fog", "haze")),
    UNKNOWN(":earth_americas:", Collections.emptyList());

    @Getter
    private final String emoji;
    private final List<String> conditions;

    WeatherIcon(String emoji, List<String> conditions) {
        this.emoji = emoji;
        this.conditions = conditions;
    }


    public static WeatherIcon fromCondition(String condition) {
        String lowercaseCondition = condition.toLowerCase();
        return Arrays.stream(WeatherIcon.values())
                .filter(icon -> icon.conditions.stream()
                        .anyMatch(lowercaseCondition::contains))
                .findFirst()
                .orElse(UNKNOWN);
    }

}
