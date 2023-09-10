package com.haziy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController // 这个注解是@Controller ＋　@ResponseBody 两个注解的集成，表示这个controller类所有接口返回的参数是json数据
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * springmvc 接受数据
     * 1.普通类型
     * 2.对象参数
     * 3.嵌套对象参数
     * 4.数组对象
     * 5.集合
     *
     */
    /**
     * RequestMapping 默认的情况下 RequestMapping支持所有请求方式 例如 get、post 、delete
     * method = RequestMethod.POST 设定该接口支持的类型 post
     *
     * @return
     */
    //1.普通类型
    @RequestMapping("/demo01")

    public String demo01(String name, Integer age) {
        return "name:" + name + ", age:" + age;
    }

    @RequestMapping("/demo02")
    public String demo02(@RequestParam( name = "name",required = false) String stuName,
                         @RequestParam(name = "age",required = false) Integer stuAge) {
        return "stuName:" + stuName + ", stuAge:" + stuAge;
    }


}
