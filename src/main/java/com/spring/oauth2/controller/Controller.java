package com.spring.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class Controller {


    @GetMapping
    public String get(){
        return "<h2>Hi Welcome!!!</h2>";
    }

    @GetMapping("login")
    public String login(){
        return "successfully logged in.";
    }

    @GetMapping("home")
    public String home(){
        return "you are in home";
    }

    @GetMapping("user")
    @ResponseBody
    public Principal home(Principal principal){
        System.out.println(principal);
        return principal;
    }



}
