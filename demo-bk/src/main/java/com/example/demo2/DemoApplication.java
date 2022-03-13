package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx  = SpringApplication.run(DemoApplication.class, args);
		String [] beanName = ctx.getBeanDefinitionNames();
        Arrays.sort(beanName);
        for(String name : beanName) {
            System.out.println(name);
        }
	}

}
