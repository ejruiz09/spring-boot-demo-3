package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{

}
