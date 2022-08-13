package com.juandaabril.users.core.infrastructure.repository;

import com.juandaabril.users.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataCrudUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
