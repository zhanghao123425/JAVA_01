package com.haziy.controller;

import com.haziy.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {
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
    @ResponseBody
    public String demo01(String name, Integer age) {
        return "name:" + name + ", age:" + age;
    }

    @RequestMapping("/demo02")
    @ResponseBody
    public String demo02(@RequestParam(name = "name", required = false) String stuName,
                         @RequestParam(name = "age", required = false) Integer stuAge) {
        return "stuName:" + stuName + ", stuAge:" + stuAge;
    }

    //    2.对象参数
    @RequestMapping("/demo03")
    @ResponseBody
    public String demo03(StudentEntity studentEntity) {
        return "name:" + studentEntity.getName() + ",age:" + studentEntity.getAge();
    }

    //    3.嵌套对象参数
    @RequestMapping("/demo04")
    @ResponseBody
    public String demo04(StudentEntity studentEntity) {
        return "name:" + studentEntity.getName() + ",age:" + studentEntity.getAge() + ",classes:" + studentEntity.getClassesEntity();
    }

    //4.数组对象
    @RequestMapping("/demo05")
    @ResponseBody
    public String demo05(String[] arrays) {
        return Arrays.toString(arrays);
    }
    //5.集合
    @RequestMapping("/demo06")
    @ResponseBody
    public String demo06(@RequestParam List<String> list) {
        return list.toString();
    }

}
