package com.jeangabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeangabriel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
