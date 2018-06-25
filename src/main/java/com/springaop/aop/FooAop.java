package com.springaop.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class FooAop {

    @Before("execution(* com.springaop.controller.FooController.aopExample(..))")
    public void beforMethod() {
        System.out.println("Process start.....");

    }

    @After("execution(* com.springaop.controller.FooController.aopExample(..))")
    public void afterMethod() {
        System.out.println("Process completed...");

    }




/*
// we can achieve the functionality of both @Before and @After advice. For this we need to create a method annotated with @Around in aspect class

    @Around("execution(* com.springaop.controller.FooController.aopExample(..))")
    public void aroundMethod(ProceedingJoinPoint joinPoint){

        System.out.println("@Around: Before calculation-"+ new Date());
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("@Around: After calculation-"+ new Date());
    }
*/

    @AfterReturning(pointcut = "execution(* com.springaop.controller.FooController.aopExample(..))",
            returning = "val")
    public void afteraopExample(Object val) {
        System.out.println("Return.............." + val);


    }

}
