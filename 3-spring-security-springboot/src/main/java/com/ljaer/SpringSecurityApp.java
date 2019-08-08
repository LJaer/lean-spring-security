package com.ljaer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity  //启动SpringSecurity过滤器链
public class SpringSecurityApp {
    public static void main(String[] args){
        SpringApplication.run(SpringSecurityApp.class,args);
    }
}