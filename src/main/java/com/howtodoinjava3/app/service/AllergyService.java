package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Allergy;
import com.howtodoinjava3.app.repository.AllergyRepository;

@Service
@Transactional
public class AllergyService {

	@Autowired
	private AllergyRepository allrepo;
	
	public List<Allergy> listAll(){
		return allrepo.findAll();
	}
	
	public void save(Allergy allergy) {
		allrepo.save(allergy);
	}
	
	public Allergy get(int id) {
		return allrepo.findById(id).get();
	}
	
	public void delete(int id) {
		allrepo.deleteById(id);
	}
}
