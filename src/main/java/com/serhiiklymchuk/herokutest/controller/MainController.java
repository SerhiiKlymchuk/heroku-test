package com.serhiiklymchuk.herokutest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

    @ResponseBody
    @GetMapping
    public String getHello(){
        return "Hello ,damn heroku!";
    }
}
