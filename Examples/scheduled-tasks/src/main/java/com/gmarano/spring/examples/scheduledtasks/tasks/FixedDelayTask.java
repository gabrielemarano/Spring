package com.gmarano.spring.examples.scheduledtasks.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FixedDelayTask implements ITask {
    private static final Logger log = LoggerFactory.getLogger(FixedDelayTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /* @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}") */
    /* @Scheduled(fixedDelay = 1000) */
    /* @Scheduled(fixedDelay = 1000, initialDelay = 2000) */
    @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}", initialDelayString = "${initialDelay.in.milliseconds}")
    public void runTask() {
        log.info("ThreadName : {} - [{}] : Fixed delay task", Thread.currentThread().getName(), dateFormat.format(new Date()));
    }

}
