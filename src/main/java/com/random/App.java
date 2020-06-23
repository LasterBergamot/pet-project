package com.random;

import com.random.config.ApplicationConfiguration;
import com.random.service.IRandomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        IRandomService randomService = (IRandomService) context.getBean("randomService");
        IRandomService randomServiceWithFields = (IRandomService) context.getBean("randomServiceWithFields");
        IRandomService randomServiceWithEnvironment = (IRandomService) context.getBean("randomServiceWithEnvironment");
        IRandomService randomServiceWithPostConstructValues = (IRandomService) context.getBean("randomServiceWithPostConstructValues");

        System.out.println(String.format("Random number with default values [1, 10]: %d", randomService.getRandomInteger()));
        System.out.println(String.format("Random number with constructor values [20, 30]: %d", randomService.getRandomInteger(20, 30)));
        System.out.println(String.format("Random number with @Value values [40, 50]: %d", randomServiceWithFields.getRandomInteger()));
        System.out.println(String.format("Random number with Environment values [60, 70]: %d", randomServiceWithEnvironment.getRandomInteger()));
        System.out.println(String.format("Random number with @PostConstruct values [80, 90]: %d", randomServiceWithPostConstructValues.getRandomInteger()));
    }
}
