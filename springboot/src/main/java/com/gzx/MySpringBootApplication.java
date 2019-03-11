package com.gzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.gzx.task")
//开启定时任务
@EnableScheduling
public class MySpringBootApplication {
    
    public static void main(String[] args) {        
        //入口运行类
        SpringApplication.run(MySpringBootApplication.class, args);
        
    }

}
