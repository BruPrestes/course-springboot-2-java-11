package com.bpotecnologia.course.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpotecnologia.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}