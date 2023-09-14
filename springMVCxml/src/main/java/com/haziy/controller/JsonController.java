package com.haziy.controller;

import com.haziy.entity.StudentEntity;
import com.haziy.utils.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/json")
public class JsonController {

    // 1.list<object> 接受json数据
    @RequestMapping("/demo01")
    public List<StudentEntity> demo01(@RequestBody List<StudentEntity> list) {

        return list;
    }

    @RequestMapping("/demo02")
    public StudentEntity demo02(@RequestBody StudentEntity studentEntity) {

        return studentEntity;
    }

    @RequestMapping("/demo03")
    public StudentEntity demo03(@RequestBody StudentEntity studentEntity, HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.toString());
        System.out.println(httpServletRequest.getContextPath());
        System.out.println(httpServletRequest.getAuthType());
        System.out.println(httpServletRequest.getMethod());
        return studentEntity;
    }

    @RequestMapping("/demo04")
    public R demo04(@RequestBody StudentEntity studentEntity, HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.toString());
        System.out.println(httpServletRequest.getContextPath());
        System.out.println(httpServletRequest.getAuthType());
        System.out.println(httpServletRequest.getMethod());

        return R.ok().put("StudentEntity",studentEntity);
    }
}
