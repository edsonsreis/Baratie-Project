package com.restaurantebaratie.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurantebaratie.application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
