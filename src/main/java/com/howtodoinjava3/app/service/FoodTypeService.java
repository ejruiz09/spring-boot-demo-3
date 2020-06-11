package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.FoodType;
import com.howtodoinjava3.app.repository.FoodTypeRepository;

@Service
@Transactional
public class FoodTypeService {

	@Autowired
	private FoodTypeRepository repo;
	
	public List<FoodType> listAll(){
		return repo.findAll();
	}
	
	public void save(FoodType foodtype) {
		repo.save(foodtype);
	}
	
	public FoodType get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
