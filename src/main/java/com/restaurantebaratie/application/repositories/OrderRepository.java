package com.restaurantebaratie.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantebaratie.application.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
