package com.howtodoinjava3.app.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AttackTracker {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	private Date date;
	@Column(name = "time")
	private Timestamp time;
	@Column(name = "description")
	private String description;
	@Column(name = "first_aid")
	private int firstaid;
	@Column(name = "healed")
	private int healed;
	
	public AttackTracker(int id, Date date, Timestamp time, String description, int firstaid, int healed) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.description = description;
		this.firstaid = firstaid;
		this.healed = healed;
	}
	
	public AttackTracker() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
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
		return "AttackTracker [id=" + id + ", date=" + date + ", time=" + time + ", description=" + description
				+ ", firstaid=" + firstaid + ", healed=" + healed + "]";
	}
	
	
	
}
