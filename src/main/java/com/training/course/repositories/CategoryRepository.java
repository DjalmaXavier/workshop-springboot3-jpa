package com.training.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
