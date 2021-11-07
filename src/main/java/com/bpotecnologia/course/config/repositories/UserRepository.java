package com.bpotecnologia.course.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpotecnologia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}