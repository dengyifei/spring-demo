package com.dao;

import com.xefei.annotation.Dao1Annotation;
import org.springframework.stereotype.Component;

@Dao1Annotation
@Component
public class T1Dao {

    public void getT1(){
        System.out.println("11111");
    }

    public void init(){
        System.out.println("xxx");
    }
}
