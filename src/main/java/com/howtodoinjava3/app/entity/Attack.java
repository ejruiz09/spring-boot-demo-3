package com.howtodoinjava3.app.entity;

import java.sql.Date;

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
	private String timeofday;
	@Column(name="description")
	private String description;
	@Column(name="firstaid")
	private int firstaid;
	@Column(name="healed")
	private int healed;
	
	
	public Attack(int number, String date, String timeofday, String description, int firstaid, int healed) {
		super();
		this.number = number;
		this.date = date;
		this.timeofday = timeofday;
		this.description = description;
		this.firstaid = firstaid;
		this.healed = healed;
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

	@Override
	public String toString() {
		return "Attack [number=" + number + ", date=" + date + ", timeofday=" + timeofday + ", description="
				+ description + ", firstaid=" + firstaid + ", healed=" + healed + "]";
	}
	
	
}
