package com.service.app.notification.entity;

import java.sql.Date;

public class Remainder {
	 private long id;
	 private String name;
	 private Date remaindDate;
	 private boolean notified;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRemaindDate() {
		return remaindDate;
	}
	public void setRemaindDate(Date remaindDate) {
		this.remaindDate = remaindDate;
	}
	public boolean isNotified() {
		return notified;
	}
	public void setNotified(boolean notified) {
		this.notified = notified;
	}
	 
	 
	 


}
