package com.camaratek.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camaratek.batch.modele.User;

public interface UserRepository extends JpaRepository<User, Long> {}
