package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Activities;
import com.howtodoinjava3.app.repository.ActivitiesRepository;

@Service
@Transactional
public class ActivitiesService {

	@Autowired
	private ActivitiesRepository repo;

	public List<Activities> listAll() {
		return repo.findAll();
	}

	public void save(Activities activities) {
		repo.save(activities);
	}

	public Activities get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
}
