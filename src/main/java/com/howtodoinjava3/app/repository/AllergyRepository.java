package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Allergy;

public interface AllergyRepository extends JpaRepository<Allergy, Integer> {

}
