package com.haziy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.haziy.controller")
//@EnableWebMvc
public class SpringMVCConfig {
    /**
     * 1.@Configuration  定义SpringMVCConfig.xml配置文件
     * 2.需要将我们的控制类注入到ioc容器 @ComponentScan("com.haziy.controller")
     * @ComponentScan("com.mayikt.controller")将该包下所有的类 注入到IOC容器种
     * 3.在springmvc原理 所有请求过来先达到我们的 DispatcherServlet 分发具体控制类 方法执行
     */


}
