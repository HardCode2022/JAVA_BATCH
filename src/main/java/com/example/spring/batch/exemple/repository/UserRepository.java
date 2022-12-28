package com.example.spring.batch.exemple.repository;

import com.example.spring.batch.exemple.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
}
