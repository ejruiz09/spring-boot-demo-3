package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava3.app.entity.Emotion;

public interface EmotionRepository extends JpaRepository<Emotion, Integer> {

}
