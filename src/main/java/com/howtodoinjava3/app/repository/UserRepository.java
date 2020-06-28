package com.howtodoinjava3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.howtodoinjava3.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
