package com.example.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping") // <---- dont't forget the requestMapping
public class PingController {

    @GetMapping
    public String ping() {
        return "pong";
    }
}
