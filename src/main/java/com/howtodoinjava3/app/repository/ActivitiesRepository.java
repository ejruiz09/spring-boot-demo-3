package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Activities;

public interface ActivitiesRepository extends JpaRepository<Activities, Integer> {

}
