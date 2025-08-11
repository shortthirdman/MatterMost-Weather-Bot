package com.shortthirdman.mattermostbot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WindInfo {
    @JsonProperty("speed")
    private double speed;
    @JsonProperty("deg")
    private int degree;
}
