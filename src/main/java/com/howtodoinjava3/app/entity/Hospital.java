package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Hospital {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name ="doctor_name")
	private String doctorname;
	@Column(name ="physician_type")
	private int physiciantype;
	@Column(name ="fee")
	private int fee;
	@Column(name ="date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	@Column(name = "frequency")
	private int frequency;
	@Column(name="medication")
	private int medication;
	
	public Hospital(int id, String name, String doctorname, int physiciantype, int fee, String date, int frequency,
			int medication) {
		super();
		this.id = id;
		this.name = name;
		this.doctorname = doctorname;
		this.physiciantype = physiciantype;
		this.fee = fee;
		this.date = date;
		this.frequency = frequency;
		this.medication = medication;
	}
	
	
	public Hospital() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDoctorname() {
		return doctorname;
	}


	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}


	public int getPhysiciantype() {
		return physiciantype;
	}


	public void setPhysiciantype(int physiciantype) {
		this.physiciantype = physiciantype;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
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


	public int getMedication() {
		return medication;
	}


	public void setMedication(int medication) {
		this.medication = medication;
	}


	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", doctorname=" + doctorname + ", physiciantype="
				+ physiciantype + ", fee=" + fee + ", date=" + date + ", frequency=" + frequency + ", medication="
				+ medication + "]";
	}
	
	
	
}
