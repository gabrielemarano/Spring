package com.gmarano.spring.examples.aspects.business;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    @Test
    public void invokeBusiness1() throws InterruptedException {
        logger.info(business1.calculateSomething());
    }

    @Test
    @Ignore
    public void invokeBusiness2() throws InterruptedException {
        logger.info(business2.calculateSomething());
    }
}
