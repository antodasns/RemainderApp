package com.service.app.notification.service;

import java.util.List;

import com.service.app.notification.entity.Notification;

public interface NotificationService {
	
	public void saveNotification(Notification notif);
	
	public List<Notification> getAllNotification();

}
