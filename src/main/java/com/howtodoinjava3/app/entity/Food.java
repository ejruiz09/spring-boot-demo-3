package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Food {
	
	@Id
	@GeneratedValue
	@Column(name="intake")
	private int intake;
	@Column(name="date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	@Column(name="type")
	private int type;
	@Column(name="activities")
	private int activities;
	@Column(name="start_time")
	@DateTimeFormat(pattern = "hh:mm:ss a")
	private String starttime;
	@Column(name="end_time")
	@DateTimeFormat(pattern = "hh:mm:ss a")
	private String endtime;
	
	public Food(int intake, String date, int type, int activities, String starttime, String endtime) {
		super();
		this.intake = intake;
		this.date = date;
		this.type = type;
		this.activities = activities;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	
	public Food() {
		
	}

	public int getIntake() {
		return intake;
	}

	public void setIntake(int intake) {
		this.intake = intake;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getActivities() {
		return activities;
	}

	public void setActivities(int activities) {
		this.activities = activities;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	@Override
	public String toString() {
		return "Food [intake=" + intake + ", date=" + date + ", type=" + type + ", activities=" + activities
				+ ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}
	
	

}
