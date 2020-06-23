package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.SleepTracker;

public interface SleepTrackerRepository extends JpaRepository<SleepTracker, Integer> {

}
