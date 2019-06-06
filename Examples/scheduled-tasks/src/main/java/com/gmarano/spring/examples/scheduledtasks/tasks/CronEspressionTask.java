package com.gmarano.spring.examples.scheduledtasks.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CronEspressionTask implements ITask {
    private static final Logger log = LoggerFactory.getLogger(CronEspressionTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /* @Scheduled(cron = "0 15 10 15 * ?") */
    @Scheduled(cron = "${cron.expression}")
    public void runTask() {
        log.info("ThreadName : {} - [{}] : Cron expressions task", Thread.currentThread().getName(), dateFormat.format(new Date()));
    }

}
