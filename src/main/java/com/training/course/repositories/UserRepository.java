package com.training.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
