package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class U1Service {

    private U2Service u2Service;

//    public U1Service(U2Service u2Service){
//        this.u2Service=u2Service;
//    }

    @Autowired
    public void setU2Service(U2Service u2Service) {
        this.u2Service = u2Service;
    }

    public U2Service getU2Service() {
        return u2Service;
    }
}
