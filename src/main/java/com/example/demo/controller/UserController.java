package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   @GetMapping("/test")
    public String test(){
        return "部署jekins测试项目示例";
    }

}
