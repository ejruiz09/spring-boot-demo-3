package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.SleepTracker;
import com.howtodoinjava3.app.repository.SleepTrackerRepository;

@Service
@Transactional
public class SleepTrackerService {

	@Autowired
	private SleepTrackerRepository repo;
	
	public List<SleepTracker> listAll(){
		return repo.findAll();
	}
	
	public void save(SleepTracker sleeptracker) {
		repo.save(sleeptracker);
	}
	
	public SleepTracker get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
