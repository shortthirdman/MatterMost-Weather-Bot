package com.shortthirdman.mattermostbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties
public class MatterMostWeatherBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatterMostWeatherBotApplication.class, args);
	}

}
