package com.jeangabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeangabriel.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
