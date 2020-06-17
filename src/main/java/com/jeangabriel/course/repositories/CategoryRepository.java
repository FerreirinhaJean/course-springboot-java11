package com.jeangabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeangabriel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
