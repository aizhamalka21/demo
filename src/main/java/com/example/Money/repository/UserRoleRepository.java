package com.example.Money.repository;


import com.example.Money.entity.User;
import com.example.Money.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findByUser(User user);

}
