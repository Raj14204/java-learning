package com.prathamesh.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @RequestMapping("/")
public String great(){
    return "Welcome to Prathamesh";
}

@RequestMapping("/about")
public String about(){
        return "About Page aa";
}
}
