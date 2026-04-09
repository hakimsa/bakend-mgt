package com.example.mangerapi.repository;

import com.example.mangerapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing {@link User} entities.
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}