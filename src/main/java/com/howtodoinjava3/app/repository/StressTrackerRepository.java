package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.StressTracker;

public interface StressTrackerRepository extends JpaRepository<StressTracker, Integer> {

}
