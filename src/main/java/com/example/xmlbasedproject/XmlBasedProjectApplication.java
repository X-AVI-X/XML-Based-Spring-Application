package com.example.xmlbasedproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class XmlBasedProjectApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(XmlBasedProjectApplication.class, args);

//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
        Car car = applicationContext.getBean(Car.class);
        car.getBrand();
    }

}
