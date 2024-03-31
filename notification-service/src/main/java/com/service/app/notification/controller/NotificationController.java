package com.service.app.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.app.notification.entity.Notification;
import com.service.app.notification.entity.Remainder;
import com.service.app.notification.service.NotificationService;

@RestController
@RequestMapping("/notificationservice/api")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/saveNotification")
	public void saveNotification(@RequestBody Remainder rem) { 
		
		Notification notif=new Notification();
		
		notif.setRemainderId(rem.getId());
		
		notif.setRemaindDate(rem.getRemaindDate());
		
		notificationService.saveNotification(notif);
		
	}

}
