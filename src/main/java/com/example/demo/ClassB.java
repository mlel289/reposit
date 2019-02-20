package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClassB {

    @Value("${url}")
    private String url;

    public String greetings() {
        return "Hello world, this is the url" + url;
    }

    @PostConstruct
    void init() {
        System.out.println("after init");
    }
}
