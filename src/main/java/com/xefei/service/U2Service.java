package com.xefei.service;

import org.springframework.stereotype.Service;

@Service
public class U2Service {

    private String fruit;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
