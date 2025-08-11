package com.shortthirdman.mattermostbot.model;

import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
public class WeatherData {

    private Coordinates coord;
    private List<WeatherInfo> weather;
    private String base;
    private MainInfo main;
    private BigInteger visibility;
    private WindInfo wind;
    private CloudsInfo clouds;
    private Long dt;
    private SysInfo sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;
}
