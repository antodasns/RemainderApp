package com.service.app.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.app.notification.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
