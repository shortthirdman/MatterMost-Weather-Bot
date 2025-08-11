package com.shortthirdman.mattermostbot.controller;

import com.shortthirdman.mattermostbot.model.Message;
import com.shortthirdman.mattermostbot.service.MatterMostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MatterMostService matterMostService;

    @PostMapping("/message")
    public void message(@RequestBody Message message) {
        matterMostService.sendMessage(message);
    }

    @GetMapping("/postWeather")
    public void postWeather() {
        matterMostService.postWeather();
    }
}
