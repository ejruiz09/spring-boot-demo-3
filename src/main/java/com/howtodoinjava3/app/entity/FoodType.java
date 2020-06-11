package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodType {

	@Id
	@GeneratedValue
	@Column(name="number")
	private int  number;
	@Column(name = "detail")
	private String detail;
	
	public FoodType(int number, String detail) {
		super();
		this.number = number;
		this.detail = detail;
	}
	
	public FoodType() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "FoodType [number=" + number + ", detail=" + detail + "]";
	}
	
	
	
	
}
