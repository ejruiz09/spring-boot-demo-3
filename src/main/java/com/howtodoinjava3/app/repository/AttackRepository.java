package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Attack;

public interface AttackRepository extends JpaRepository<Attack, Integer> {

}
