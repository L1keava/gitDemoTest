package com.scy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String sayHello() {
        System.out.println("FirstController 被访问");
        return "200";
    }
}
