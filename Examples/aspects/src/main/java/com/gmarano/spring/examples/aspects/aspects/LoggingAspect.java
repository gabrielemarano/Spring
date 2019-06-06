package com.gmarano.spring.examples.aspects.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("within(com.gmarano.spring.examples.aspects.*)")
    public void logBeforeAllMethoodsInvocation(JoinPoint joinPoint){
        logger.info("Invoking method: " + joinPoint.getSignature());
    }

}
