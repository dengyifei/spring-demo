package com.xefei.tool;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@Configuration
public class MsgSourceTest {

    /**
     * 国际化
     * @return
     */
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("messages");
        return resourceBundleMessageSource;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MsgSourceTest.class);
        MessageSource msg = (MessageSource)ac.getBean("messageSource");
        String xx = msg.getMessage("xx", null, Locale.CHINA);
        System.out.println(xx);
    }

}
