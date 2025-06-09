package com.scy.controller;

import com.scy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {
    @RequestMapping("/register")
    public void showPageByVoid() {
        System.out.println("ShowPageByVoid running.");
    }
    @RequestMapping("/showPageByString")
    public String showPageByString(){
        System.out.println("showPageByString running");
        return "register";
    }
    @RequestMapping("/showPageByForward")
    public String showPageByForward() {
        System.out.println("ShowPageByForward running");
        return "forward:orders.jsp";
    }
    @RequestMapping("/showPageByRedirect")
    public String showPageByRedirect() {
        System.out.println("showPageByRedirect running");
        return "redirect:http://www.itheima.com";
    }
    @RequestMapping("/showPageByRequest")
    public String showPageByRequest(HttpServletRequest request) {
        System.out.println("showPageByRequest running");
        request.setAttribute("username","request");
        return "register";
    }
    @RequestMapping("/showPageByModel")
    public String showPageByModel (Model model) {
        System.out.println("showPageByModel running");
        model.addAttribute("username","石长壹");
        User user =new User();
        user.setPassword("password");
        model.addAttribute("user",user);
        return "register";
    }
}
