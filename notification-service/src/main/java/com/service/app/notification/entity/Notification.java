package com.service.app.notification.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notification")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private long remainderId;
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	 private Date remaindDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRemainderId() {
		return remainderId;
	}
	public void setRemainderId(long remainderId) {
		this.remainderId = remainderId;
	}
	public Date getRemaindDate() {
		return remaindDate;
	}
	public void setRemaindDate(Date remaindDate) {
		this.remaindDate = remaindDate;
	}
	 
	 

}
