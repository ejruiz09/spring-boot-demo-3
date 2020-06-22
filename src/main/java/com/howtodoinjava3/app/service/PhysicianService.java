package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Physician;
import com.howtodoinjava3.app.repository.PhysicianRepository;

@Service
@Transactional
public class PhysicianService {

	@Autowired
	private PhysicianRepository repo;
	
	public List<Physician> listAll(){
		return repo.findAll();
	}
	
	public void save(Physician physician) {
		repo.save(physician);
	}
	
	public Physician get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
