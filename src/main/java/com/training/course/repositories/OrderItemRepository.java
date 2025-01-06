package com.training.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.course.entities.OrderItem;
import com.training.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
