package com.restaurantebaratie.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantebaratie.application.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
