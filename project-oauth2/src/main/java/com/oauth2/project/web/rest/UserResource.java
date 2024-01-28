package com.oauth2.project.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {


    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/account")
    public String account(){
        return "Account";

    }
}
