package com.service.app.notification.sheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.app.notification.service.NotificationService;

@Component
public class MyNotification implements Runnable{
	
	@Autowired
	NotificationService notificationService;
	
	@Override
    public void run() {
		
		notificationService.getAllNotification();
        // Your code to be executed every 5 minutes goes here
        System.out.println("Executing notification every 30 secs...");
    }

}
