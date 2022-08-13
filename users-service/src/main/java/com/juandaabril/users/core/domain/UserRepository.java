package com.juandaabril.users.core.domain;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    public void save(User user);
    public Optional<User> findByEmail(String email);
    public Optional<User> findById(Long userId);
    public List<User> findAll();
    public void deleteById(Long userId);
}
