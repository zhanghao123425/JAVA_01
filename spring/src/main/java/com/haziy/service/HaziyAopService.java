package com.haziy.service;

import org.springframework.stereotype.Component;

@Component
public class HaziyAopService {

    public String addNumber(){
//        int j = 1/0;
        System.out.println("addNumber 方法。。。。。。。。。。");
        return "ok";
    }
}
