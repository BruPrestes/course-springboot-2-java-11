package com.bpotecnologia.course.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpotecnologia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}