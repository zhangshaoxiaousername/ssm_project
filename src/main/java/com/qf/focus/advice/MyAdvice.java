package com.qf.focus.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {

    //设置切入点
    @Pointcut("execution(* com.qf.focus.service.impl.*.*(..))")
    public void pointcut() {}

    //方法前增强
    @Before("MyAdvice.pointcut()")
    public void before(){
        System.out.println("这是前置通知");
    }


    //环绕增强
    @Around("MyAdvice.pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通知之前部分!!");
        Object object = point.proceed(); //调用目标方法
        System.out.println("这是环绕通知之后的部分!!");
        return  object;
    }




}
