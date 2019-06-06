package com.gmarano.spring.examples.scheduledtasks.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FixedRateTask implements ITask {
    private static final Logger log = LoggerFactory.getLogger(FixedRateTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /* @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}") */
    /* @Scheduled(fixedRate = 1000) */
    /* @Scheduled(fixedRate = 1000, initialDelay = 2000) */
    @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}", initialDelayString = "${initialDelay.in.milliseconds}")
    public void runTask() {
        log.info("ThreadName : {} - [{}] : Fixed rate task", Thread.currentThread().getName(), dateFormat.format(new Date()));
    }

}
