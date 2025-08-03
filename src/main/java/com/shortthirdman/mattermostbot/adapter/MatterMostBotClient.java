package com.shortthirdman.mattermostbot.adapter;

import com.shortthirdman.mattermostbot.model.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface MatterMostBotClient {

    @PostExchange
    void sendMessage(@RequestBody Message message);
}
