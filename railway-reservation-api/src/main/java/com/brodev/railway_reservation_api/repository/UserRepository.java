package com.brodev.railwayreservationapi.repository;

import com.brodev.railwayreservationapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Later: custom findByEmail(), etc.
}