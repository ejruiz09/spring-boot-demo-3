package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Physician;

public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

}
