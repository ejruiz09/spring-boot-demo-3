package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Attack {

	@Id
	@GeneratedValue
	@Column(name="number")
	private int number;
	@Column(name="date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	@Column(name="timeofday")
	@DateTimeFormat(pattern = "hh:mm:ss a")
	private String timeofday;
	@Column(name="description")
	private String description;
	@Column(name="firstaid")
	private int firstaid;
	@Column(name="healed")
	private int healed;
	@Column(name="frequency")
	private int frequency;
	
	
	public Attack(int number, String date, String timeofday, String description, int firstaid, int healed, int frequency) {
		super();
		this.number = number;
		this.date = date;
		this.timeofday = timeofday;
		this.description = description;
		this.firstaid = firstaid;
		this.healed = healed;
		this.frequency = frequency;
	}

	public Attack() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimeofday() {
		return timeofday;
	}

	public void setTimeofday(String timeofday) {
		this.timeofday = timeofday;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getFirstaid() {
		return firstaid;
	}

	public void setFirstaid(int firstaid) {
		this.firstaid = firstaid;
	}

	public int getHealed() {
		return healed;
	}

	public void setHealed(int healed) {
		this.healed = healed;
	}
	
	

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Attack [number=" + number + ", date=" + date + ", timeofday=" + timeofday + ", description="
				+ description + ", firstaid=" + firstaid + ", healed=" + healed + ", frequency=" + frequency + "]";
	}
	
	
}
