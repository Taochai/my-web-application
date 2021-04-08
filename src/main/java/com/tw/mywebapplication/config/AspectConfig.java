package com.tw.mywebapplication.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {


    @Pointcut(value = "execution(* com.tw.mywebapplication.DAO.Student.*(..))")
    private void pointCut() {
    }


    @Before("pointCut()")
    public void before() {
        System.out.println("Before aspect!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("After aspect!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning aspect!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing aspect!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around starting aspect!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Object proceed = pjp.proceed();
//        System.out.println(proceed.getClass());
        System.out.println("Around ending aspect!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return null;
    }
}
