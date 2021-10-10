package com.xefei.tool;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
public class ResourceTest {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ResourceTest.class);

        //Resource resource = ac.getResource("classpath:test.properties");
        //Resource resource = ac.getResource("file:test.properties");
        //System.out.println(resource.getFile().getAbsolutePath());
//        Resource resource = ac.getResource("http://www.baidu.com");
//        FileCopyUtils.copy(resource.getInputStream(),new FileOutputStream(new File("./11.txt")));

        Resource[] resources = ac.getResources("classpath:com/zhouyu/*.class");
        for (Resource resource:resources){
            System.out.println(resource.contentLength());
            System.out.println(resource.getFilename());
        }
    }
}
