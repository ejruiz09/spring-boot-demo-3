package com.howtodoinjava3.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class SleepTracker {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	@Column(name = "number_of_hours")
	private int numberofhours;
	
	public SleepTracker(int id, String date, int numberofhours) {
		super();
		this.id = id;
		this.date = date;
		this.numberofhours = numberofhours;
	}

	public SleepTracker() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumberofhours() {
		return numberofhours;
	}

	public void setNumberofhours(int numberofhours) {
		this.numberofhours = numberofhours;
	}

	@Override
	public String toString() {
		return "SleepTracker [id=" + id + ", date=" + date + ", numberofhours=" + numberofhours + "]";
	}
	
	
	
	
	
}
