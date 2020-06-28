package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.StressTracker;
import com.howtodoinjava3.app.repository.StressTrackerRepository;

@Service
@Transactional
public class StressTrackerService {

	@Autowired
	private StressTrackerRepository repo;
	
	public List<StressTracker> listAll(){
		return repo.findAll();
	}
	
	public void save(StressTracker stresstracker) {
		repo.save(stresstracker);
	}
	
	public StressTracker get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
