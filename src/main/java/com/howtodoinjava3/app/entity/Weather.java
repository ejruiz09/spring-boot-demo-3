package com.howtodoinjava3.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Weather {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "location")
	private String location;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date")
	private String date;
	@Column(name = "day")
	private String day;
	@Column(name = "time")
	private String time;
	@Column(name = "temperature")
	private String temperature;
	@Column(name = "hourly_temperature")
	private String hourlytemperature;
	@Column(name = "daily_temperature")
	private String dailytemperature;
	@Column(name = "humidity")
	private String humidity;
	@Column(name = "ux_index")
	private String uxindex;
	@Column(name = "pollen_running")
	private String pollenrunning;
	
	public Weather(int id, String location, String date, String day, String time, String temperature,
			String hourlytemperature, String dailytemperature, String humidity, String uxindex, String pollenrunning) {
		super();
		this.id = id;
		this.location = location;
		this.date = date;
		this.day = day;
		this.time = time;
		this.temperature = temperature;
		this.hourlytemperature = hourlytemperature;
		this.dailytemperature = dailytemperature;
		this.humidity = humidity;
		this.uxindex = uxindex;
		this.pollenrunning = pollenrunning;
	}
	

	public Weather() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHourlytemperature() {
		return hourlytemperature;
	}

	public void setHourlytemperature(String hourlytemperature) {
		this.hourlytemperature = hourlytemperature;
	}

	public String getDailytemperature() {
		return dailytemperature;
	}

	public void setDailytemperature(String dailytemperature) {
		this.dailytemperature = dailytemperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getUxindex() {
		return uxindex;
	}

	public void setUxindex(String uxindex) {
		this.uxindex = uxindex;
	}

	public String getPollenrunning() {
		return pollenrunning;
	}

	public void setPollenrunning(String pollenrunning) {
		this.pollenrunning = pollenrunning;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", location=" + location + ", date=" + date + ", day=" + day + ", time=" + time
				+ ", temperature=" + temperature + ", hourlytemperature=" + hourlytemperature + ", dailytemperature="
				+ dailytemperature + ", humidity=" + humidity + ", uxindex=" + uxindex + ", pollenrunning="
				+ pollenrunning + "]";
	}
	
	
	
	
	
}
