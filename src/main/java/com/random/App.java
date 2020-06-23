package com.random;

import com.random.config.ApplicationConfiguration;
import com.random.service.IRandomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        IRandomService randomServiceWithFields = (IRandomService) context.getBean("randomServiceWithFields");

        System.out.println(randomServiceWithFields.getRandomInteger());
    }
}
