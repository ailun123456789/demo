package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    @ResponseBody
    public String getUserList() {
        System.out.println("西西飒撒旦？旦 啊是大angwen ");
        return ",这才是你们说你笨部署啊:1111";
        System.out.println("this is my change");
    }
}
