package com.shortthirdman.mattermostbot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Message {
    private String username;
    private String text;
    private String channel;

    @JsonProperty("icon_emoji")
    private String iconEmoji;
}
