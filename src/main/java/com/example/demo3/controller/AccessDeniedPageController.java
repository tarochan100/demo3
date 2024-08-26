package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessDeniedPageController {
    @GetMapping("/accessDeniedPage")
    public String accessDeniedPage() {
        return "accessDeniedPage";
    }
}