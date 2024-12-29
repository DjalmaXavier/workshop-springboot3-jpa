package com.training.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
