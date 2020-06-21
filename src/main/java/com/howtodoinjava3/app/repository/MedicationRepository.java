package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {

}
