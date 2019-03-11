package com.gzx.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class UserTask {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
    // ����ÿ��3��ִ������
    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        System.out.println("����ʱ�䣺" + dateFormat.format(new Date()));
    }
}
