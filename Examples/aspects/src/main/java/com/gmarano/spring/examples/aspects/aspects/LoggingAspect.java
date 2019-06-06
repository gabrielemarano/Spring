package com.gmarano.spring.examples.aspects.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("within(com.gmarano.spring.examples.aspects.*)")
    public void logBeforeAllMethoodsInvocation(JoinPoint joinPoint){
        logger.info("Before method: " + joinPoint.getSignature());
    }

    @After("within(com.gmarano.spring.examples.aspects.*)")
    public void logAfterAllMethoodsInvocation(JoinPoint joinPoint){
        logger.info("After method (success or exception): " + joinPoint.getSignature());
    }

    @AfterReturning("within(com.gmarano.spring.examples.aspects.*)")
    public void logAfterReturningAllMethoodsInvocation(JoinPoint joinPoint){
        logger.info("AfterReturning method (success): " + joinPoint.getSignature());
    }

    @AfterThrowing("within(com.gmarano.spring.examples.aspects.*)")
    public void logAfterThrowingAllMethoodsInvocation(JoinPoint joinPoint){
        logger.info("AfterThrowing method (exception): " + joinPoint.getSignature());
    }

}
