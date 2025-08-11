package com.shortthirdman.mattermostbot.config;

import com.shortthirdman.mattermostbot.adapter.MatterMostBotClient;
import com.shortthirdman.mattermostbot.adapter.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class MattermostBotConfiguration {

    @Bean
    public MatterMostBotClient mattermostBotClient(@Value("${mattermost.webhook.url}") String webhookUrl) {
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(WebClientAdapter.create(
                        WebClient.builder()
                                .baseUrl(webhookUrl)
                                .build()
                ))
                .build();

        return factory.createClient(MatterMostBotClient.class);
    }

    @Bean
    public OpenWeatherMapClient openWeatherMapClient(@Value("${openweather.api-key}") String apiKey, @Value("${openweather.base-url}") String baseUrl) {
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(WebClientAdapter.create(
                        WebClient.builder()
                                .baseUrl(baseUrl)
                                .build()
                ))
                .build();
        return factory.createClient(OpenWeatherMapClient.class);
    }
}
