package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@org.springframework.context.annotation.Config
//@ComponentScan()
@Configuration
@PropertySource("classpath:env.properties")
public class Config {
}
