package com.shortthirdman.mattermostbot.model;

import lombok.Data;

@Data
public class WeatherInfo {
    private String id;
    private String main;
    private String description;
    private String icon;
}
