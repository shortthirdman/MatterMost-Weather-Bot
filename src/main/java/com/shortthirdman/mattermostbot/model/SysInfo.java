package com.shortthirdman.mattermostbot.model;

import lombok.Data;

@Data
public class SysInfo {

    private int type;
    private long id;
    private String country;
    private long sunrise;
    private long sunset;
}
