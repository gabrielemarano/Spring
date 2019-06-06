package com.gmarano.spring.examples.aspects;

import com.gmarano.spring.examples.aspects.annotations.TrackTime;
import org.springframework.stereotype.Component;

@Component
public class Prova {

    @TrackTime
    public void run() throws InterruptedException {

        Thread.sleep(3000);
    }

}
