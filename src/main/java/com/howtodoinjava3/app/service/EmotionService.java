package com.howtodoinjava3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava3.app.entity.Emotion;
import com.howtodoinjava3.app.repository.EmotionRepository;

@Service
@Transactional
public class EmotionService {

	@Autowired
	private EmotionRepository repo;
	
	public List<Emotion> listAll(){
		return repo.findAll();
	}
	
	public void save(Emotion emotion) {
		repo.save(emotion);
	}
	
	public Emotion get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
