package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.FirstAid;
import com.howtodoinjava3.app.repository.FirstAidRepository;

@Service
@Transactional
public class FirstAidService {

	@Autowired
	private FirstAidRepository repo;
	
	public List<FirstAid> listAll(){
		return repo.findAll();
	}
	
	public void save(FirstAid firstaid) {
		repo.save(firstaid);
	}
	
	public FirstAid get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
