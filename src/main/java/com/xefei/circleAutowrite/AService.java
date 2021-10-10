package com.xefei.circleAutowrite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AService {
    @Autowired
    private BService bService;
}
