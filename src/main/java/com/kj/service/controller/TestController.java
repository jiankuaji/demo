package com.kj.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/say")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayhello(){
     return "你好，hi";
    }
}
