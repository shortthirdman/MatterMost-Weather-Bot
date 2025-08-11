package com.shortthirdman.mattermostbot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Coordinates {

    @JsonProperty("lon")
    private double longitude;

    @JsonProperty("lat")
    private double latitude;
}
