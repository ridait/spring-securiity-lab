package com.ridait.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/main")
    public String main(){
        return "main.html";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin.html";
    }

    @GetMapping("/user")
    public String user(){
        return "user.html";
    }
}
