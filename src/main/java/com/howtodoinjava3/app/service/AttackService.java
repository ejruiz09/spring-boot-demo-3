package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Attack;
import com.howtodoinjava3.app.repository.AttackRepository;

@Service
@Transactional
public class AttackService {

	@Autowired
	private AttackRepository repo;
	
	public List<Attack> listAll() {
		return repo.findAll();
	}
	
	public void save(Attack attack) {
		repo.save(attack);
	}
	
	public Attack get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
