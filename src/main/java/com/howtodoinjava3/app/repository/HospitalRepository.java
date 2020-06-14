package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	
}
