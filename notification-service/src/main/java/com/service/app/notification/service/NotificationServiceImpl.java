package com.service.app.notification.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.app.notification.entity.Notification;
import com.service.app.notification.remainderproxy.RemainderProxy;
import com.service.app.notification.repository.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	NotificationRepository notificationRepository;
	
	@Autowired
	RemainderProxy remainderProxy;
	
	@Override
	public void saveNotification(Notification notif) {
		
		notificationRepository.save(notif);
		
	}

	@Override
	public List<Notification> getAllNotification() {
		
		List<Notification>notifList=new ArrayList<Notification>();
		
		notifList=notificationRepository.findAll();
		
		for(Notification notif:notifList) {
			
			if(notif.getRemaindDate().toString().equals(LocalDate.now().toString())) {
				
				System.out.println("Notification Triggered");
				
				remainderProxy.saveNotification(String.valueOf(notif.getRemainderId()));
				
			}
			
		}
		
		return null;
	}

}
