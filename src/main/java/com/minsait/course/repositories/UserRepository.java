package com.minsait.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsait.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
