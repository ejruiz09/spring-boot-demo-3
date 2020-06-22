package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Physician {

	@Id
	@GeneratedValue
	private int number;
	@Column(name="type")
	private String type;
	
	public Physician(int number, String type) {
		super();
		this.number = number;
		this.type = type;
	}

	public Physician() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Physician [number=" + number + ", type=" + type + "]";
	}
	
	
}
