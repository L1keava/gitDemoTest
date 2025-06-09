package com.dev.scy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String sayHello() {
        System.out.println("访问到 FirstController");
        return "success";
    }
}
