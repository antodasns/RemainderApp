package com.service.app.remainder.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="remainder")
public class Remainder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String name;
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
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
