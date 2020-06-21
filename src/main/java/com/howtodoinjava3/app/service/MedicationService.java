package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Medication;
import com.howtodoinjava3.app.repository.MedicationRepository;

@Service
@Transactional
public class MedicationService {

	@Autowired
	private MedicationRepository medrepo;
	
	public List<Medication> listAll(){
		return medrepo.findAll();
	}
	
	public void save(Medication medication) {
		medrepo.save(medication);
	}
	
	public Medication get(int id) {
		return medrepo.findById(id).get();
	}
	
	public void delete(int id) {
		medrepo.deleteById(id);
	}
}
