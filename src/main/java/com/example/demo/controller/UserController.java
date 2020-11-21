package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   @GetMapping("/test")
    public String test(){
        return "部署jenkins测试项目示例.";
    }

    @GetMapping("/jenkins")
    public String test1(){
       return "部署jenkins完成";
    }

}
