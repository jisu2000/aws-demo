package com.jisu.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping
    public String getHello(){
        return "Hello From aws";
    }

    @GetMapping("/{name}")
    public String getHelloByName(@PathVariable String name){
        return "Hi "+name+" welcome";
    }
}
