package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Food;
import com.howtodoinjava3.app.repository.FoodRepository;

@Service
@Transactional
public class FoodService {

	@Autowired
	private FoodRepository repo;
	
	public List<Food> listAll(){
		return repo.findAll();
	}
	
	public void save(Food food) {
		repo.save(food);
	} 
	
	public Food get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
