package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(String username, String userpwd, HttpSession session){
        System.out.println(username+"======"+userpwd);

        return "show";
    }
}
