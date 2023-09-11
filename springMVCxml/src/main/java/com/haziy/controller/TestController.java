package com.haziy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/get")
    @ResponseBody
    public String getStudent(){
        return "{code:'200',msg:'ok'}";
    }
}
