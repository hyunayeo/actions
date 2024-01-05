package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private Long age;

    @GetMapping("/hello")
    public String hello() {
        return "name: " + name + ", age: " + age;
    }
}
