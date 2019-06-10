package com.gmarano.spring.examples.aspects.business;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Business2Test {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Business2 business2;

    @Test
    public void invokeBusiness2() throws InterruptedException {
        logger.info(business2.calculateSomething());
    }

}