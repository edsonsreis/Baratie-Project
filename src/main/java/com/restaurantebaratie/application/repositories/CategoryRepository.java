package com.restaurantebaratie.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantebaratie.application.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
