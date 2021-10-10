package com.xefei.propereditor;

import org.springframework.beans.factory.annotation.Value;

public class UserService {

    @Value("xxxx11111")
    private User user;

    public void test(){
        System.out.println(user.getName());
    }
}
