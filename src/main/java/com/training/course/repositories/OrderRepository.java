package com.training.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
