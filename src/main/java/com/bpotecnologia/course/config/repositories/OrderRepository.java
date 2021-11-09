package com.bpotecnologia.course.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpotecnologia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}