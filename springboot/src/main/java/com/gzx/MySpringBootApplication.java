package com.gzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
//ɨ�� mybatis mapper ��·��
@MapperScan(basePackages = "com.gzx.task")
//������ʱ����
@EnableScheduling
public class MySpringBootApplication {
    
    public static void main(String[] args) {        
        //���������
        SpringApplication.run(MySpringBootApplication.class, args);
        
    }

}
