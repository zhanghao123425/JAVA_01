package com.haziy.proxy;

import com.haziy.service.HaziyAopService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserProxy {


    @Pointcut("execution(* com.haziy.service.*Service.*(..))")
    public void pointcut(){};
    /**
     * 前置通知
     */
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("aop 前置通知");
    }

    /**
     * 后置通知
     */
    @After(value = "pointcut()")
    public void after(){
        System.out.println("aop 后置通知");
    }


    @Around(value = ("execution(* com.haziy.service.*Service.*(..))"))
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知");
        System.out.println("环绕 目标方法之前执行");
        Object proceed = proceedingJoinPoint.proceed(); // 调用目标方法。（如果有目标方法）
        System.out.println("环绕 目标方法之后执行");
        return proceed;
    }

    @AfterThrowing(value = "execution(* com.haziy.service.*Service.*(..))")
    public void afterThrowing(){
        System.out.println("捕获到异常之后");
    }
}
