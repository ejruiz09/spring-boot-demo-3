package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Hospital;
import com.howtodoinjava3.app.repository.HospitalRepository;

@Service
@Transactional
public class HospitalService {

	@Autowired
	private HospitalRepository repo;
	
	public List<Hospital> listAll(){
		return repo.findAll();
	}
	
	public void save(Hospital hospital) {
		repo.save(hospital);
	}
	
	public Hospital get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
