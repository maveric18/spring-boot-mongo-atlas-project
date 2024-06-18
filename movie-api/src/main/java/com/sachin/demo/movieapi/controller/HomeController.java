package com.sachin.demo.movieapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // returns the home page (Thymeleaf view or any other view resolver)
    }

    @GetMapping("/secure")
    @ResponseBody
    public String secureEndpoint() {
        return "This is a secure endpoint";
    }
}