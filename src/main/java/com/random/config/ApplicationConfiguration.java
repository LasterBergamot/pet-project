package com.random.config;

import com.random.service.IRandomService;
import com.random.service.impl.RandomService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
    Goal: absolutely XML-less bean definition
     - type safe, String-less definition
     - replacement for an XML file
     - @Component -> recognized by scanning
     - indicates that the class is for configuration
 */
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

    @Value("${random.min}")
    private Integer min;

    @Value("${random.max}")
    private Integer max;

    /*
         - replacement for <bean>
         - methods only
         - indicates that a method produces a bean to be managed by the Spring container
         - use only in @Configuration to avoid strange bugs
     */
    @Bean(name = "randomService")
    public IRandomService getRandomService() {
        return new RandomService();
    }

    @Bean(name = "randomServiceWithFields")
    public IRandomService getRandomServiceWithFields() {
        return new RandomService(min, max);
    }
}
