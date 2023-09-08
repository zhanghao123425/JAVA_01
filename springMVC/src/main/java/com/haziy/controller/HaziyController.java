package com.haziy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HaziyController {

    @RequestMapping("/getHaziy")
    @ResponseBody
    public String getHaziy(){
        System.out.println("接口getHaziy被访问！！");
        return "{code:'200',msg:'ok'}";
    }
}
