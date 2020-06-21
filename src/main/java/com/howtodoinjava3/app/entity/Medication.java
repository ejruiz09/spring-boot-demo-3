package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Medication {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "hospital")
	private String hospital;
	@Column(name = "doctor")
	private String doctor;
	@Column(name = "physician_type")
	private int physiciantype;
	@Column(name = "date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	@Column(name = "frequency")
	private int frequency;
	@Column(name = "generic_name")
	private String genericname;
	@Column(name = "brand_name")
	private String brandname;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private int price;
	
	public Medication(int id, String hospital, String doctor, int physiciantype, String date, int frequency,
			String genericname, String brandname, int quantity, int price) {
		super();
		this.id = id;
		this.hospital = hospital;
		this.doctor = doctor;
		this.physiciantype = physiciantype;
		this.date = date;
		this.frequency = frequency;
		this.genericname = genericname;
		this.brandname = brandname;
		this.quantity = quantity;
		this.price = price;
	}

	public Medication() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public int getPhysiciantype() {
		return physiciantype;
	}

	public void setPhysiciantype(int physiciantype) {
		this.physiciantype = physiciantype;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getGenericname() {
		return genericname;
	}

	public void setGenericname(String genericname) {
		this.genericname = genericname;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Medication [id=" + id + ", hospital=" + hospital + ", doctor=" + doctor + ", physiciantype="
				+ physiciantype + ", date=" + date + ", frequency=" + frequency + ", genericname=" + genericname
				+ ", brandname=" + brandname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	
	
}
