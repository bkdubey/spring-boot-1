package com.therealdanvega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = {ThymeleafAutoConfiguration.class})
@ComponentScan
public class AutoConfigureApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigureApplication.class, args);
    }
}
