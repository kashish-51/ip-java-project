package com.example.registrationandpublicity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registrationandpublicity.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods if needed
}
