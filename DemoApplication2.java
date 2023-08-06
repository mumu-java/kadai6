package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication2 {
    @GetMapping("/hello")
    public String hello() {
        return "hello world ";
    }
}
