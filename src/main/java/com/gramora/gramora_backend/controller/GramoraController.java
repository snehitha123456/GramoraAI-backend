package com.gramora.gramora_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GramoraController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Gramora AI!";
    }
}