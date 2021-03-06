package com.gmarano.spring.examples.customthreadpool;

import com.gmarano.spring.examples.customthreadpool.tasks.FixedRateTask;
import com.gmarano.spring.examples.customthreadpool.tasks.ITask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public ITask runTask() {
        return new FixedRateTask();
    }

}
