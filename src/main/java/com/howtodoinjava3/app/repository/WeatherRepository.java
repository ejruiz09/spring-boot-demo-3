package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {

}
