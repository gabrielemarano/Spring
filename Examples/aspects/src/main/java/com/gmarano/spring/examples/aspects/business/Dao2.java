package com.gmarano.spring.examples.aspects.business;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    
    public String retrieveSomething() {
        return "Dao2";
    }
}