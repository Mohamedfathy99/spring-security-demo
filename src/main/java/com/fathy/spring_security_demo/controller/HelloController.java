package com.fathy.spring_security_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String greet(HttpServletRequest httpServletRequest) {
        return "hello world";
    }

    @GetMapping("/api/name")
    public String about(HttpServletRequest httpServletRequest) {
        return "Mohamed";
    }
}
