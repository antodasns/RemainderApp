package com.service.app.notification.sheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class NotifiactionSceduler {
	
	@Autowired
    private MyNotification myNotification;

    @PostConstruct
    public void init() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule the task to run every 5 minutes
        scheduler.scheduleAtFixedRate(myNotification, 0, 30, TimeUnit.SECONDS);
    }

}
