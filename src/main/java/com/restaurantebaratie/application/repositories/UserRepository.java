package com.restaurantebaratie.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantebaratie.application.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
