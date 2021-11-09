package com.bpotecnologia.course.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpotecnologia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}