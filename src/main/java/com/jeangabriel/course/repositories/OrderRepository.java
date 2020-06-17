package com.jeangabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeangabriel.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
