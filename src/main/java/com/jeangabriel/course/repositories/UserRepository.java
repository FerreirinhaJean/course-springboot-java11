package com.jeangabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeangabriel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
