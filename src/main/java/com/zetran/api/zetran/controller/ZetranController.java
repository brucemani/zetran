package com.zetran.api.zetran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZetranController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello world";
    }
}
