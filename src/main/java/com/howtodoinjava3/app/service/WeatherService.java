package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Weather;
import com.howtodoinjava3.app.repository.WeatherRepository;

@Service
@Transactional
public class WeatherService {

	@Autowired
	private WeatherRepository repo;
	
	public List<Weather> listAll() {
		return repo.findAll();
	}
	
	public void save(Weather weather) {
		repo.save(weather);
	}
	
	public Weather get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
