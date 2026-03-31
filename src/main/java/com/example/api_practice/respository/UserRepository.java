package com.example.api_practice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
// Update the import path to the correct location of Product class
import com.example.api_practice.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User>findByEmail(String email);
}
