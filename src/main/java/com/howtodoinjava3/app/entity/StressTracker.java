package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class StressTracker {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="emotions")
	private int emotions;
	@Column(name="date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	
	public StressTracker(int id, int emotions, String date) {
		super();
		this.id = id;
		this.emotions = emotions;
		this.date = date;
	}

	public StressTracker() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmotions() {
		return emotions;
	}

	public void setEmotions(int emotions) {
		this.emotions = emotions;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StressTracker [id=" + id + ", emotions=" + emotions + ", date=" + date + "]";
	}
	
	
	
	
}
