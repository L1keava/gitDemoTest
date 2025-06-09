package com.scy.controller;

import com.scy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    @RequestMapping("/findOrderWithUser")
    public void findOrderWithUser(User user){
        String username = user.getUsername();
        String orderId = user.getOrder().getOrderId();
        System.out.println("username:" + username + ",orderId:" + orderId);
    }
    @RequestMapping("/registerUser")
    public void registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username="+username + ",password=" + password);
    }
}
