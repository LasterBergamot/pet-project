package com.random.config;

import com.random.service.IRandomService;
import com.random.service.impl.RandomService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "randomService")
    public IRandomService getRandomService() {
        return new RandomService();
    }
}
