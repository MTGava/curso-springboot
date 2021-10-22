package com.minsait.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsait.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
