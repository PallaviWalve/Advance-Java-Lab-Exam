package com.org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.example.entity.Stock;

public interface stockRepo extends JpaRepository<Stock, Integer> {

	Stock findByCompanyName(String name);
}
