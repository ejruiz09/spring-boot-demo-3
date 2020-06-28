package com.howtodoinjava3.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {

	@Id
	@GeneratedValue
	@Column(name="userid")
	private int userId;
	@Column(name="username")
	private String username;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="password")
	private String password;
	@Column(name="age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "birthday")
	private String birthday;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "email")
	private String email;
	@Column(name = "medication")
	private String medication;
	@Column(name = "allergy")
	private int allergy;
	@Column(name = "hospital")
	private int hospital;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "lastattack")
	private String lastattack;
	@Column(name = "food")
	private int food;
	
	public User(int userId, String username, String firstname, String lastname, String password, int age, String gender,
			String birthday, String city, String country, String diagnosis, String email, String medication,
			int allergy, int hospital, String lastattack, int food) {
		super();
		this.userId = userId;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.birthday = birthday;
		this.city = city;
		this.country = country;
		this.diagnosis = diagnosis;
		this.email = email;
		this.medication = medication;
		this.allergy = allergy;
		this.hospital = hospital;
		this.lastattack = lastattack;
		this.food = food;
	}

	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public int getAllergy() {
		return allergy;
	}

	public void setAllergy(int allergy) {
		this.allergy = allergy;
	}

	public int getHospital() {
		return hospital;
	}

	public void setHospital(int hospital) {
		this.hospital = hospital;
	}

	public String getLastattack() {
		return lastattack;
	}

	public void setLastattack(String lastattack) {
		this.lastattack = lastattack;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", password=" + password + ", age=" + age + ", gender=" + gender + ", birthday=" + birthday
				+ ", city=" + city + ", country=" + country + ", diagnosis=" + diagnosis + ", email=" + email
				+ ", medication=" + medication + ", allergy=" + allergy + ", hospital=" + hospital + ", lastattack="
				+ lastattack + ", food=" + food + "]";
	}
	
	
	
	
	
	
}
