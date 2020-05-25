package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Allergy {
	
	@Id
	@GeneratedValue
	@Column(name="number")
	private int number;
	@Column(name = "description")
	private String description;
	
	public Allergy(int number, String description) {
		super();
		this.number = number;
		this.description = description;
	}
	
	public Allergy() {
		
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
		return "Allergy [number=" + number + ", description=" + description + "]";
	}
	
	
	
}
