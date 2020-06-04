package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FirstAid {

	@Id
	@GeneratedValue
	@Column(name = "number")
	private int number;
	@Column(name = "description")
	private String description;

	public FirstAid(int number, String description) {
		super();
		this.number = number;
		this.description = description;
	}

	public FirstAid() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FirstAid [number=" + number + ", description=" + description + "]";
	}
	
	

}
