package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.howtodoinjava3.app.entity.FoodType;

public interface FoodTypeRepository extends JpaRepository<FoodType, Integer>{

}
