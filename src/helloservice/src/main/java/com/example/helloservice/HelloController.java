package com.example.helloservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello(){

        return "hello";
    }
    @GetMapping("/v1")
    public String hello2(){
        return "hello2";
    }

}
