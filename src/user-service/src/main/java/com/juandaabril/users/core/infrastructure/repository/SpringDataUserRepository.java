package com.juandaabril.users.core.infrastructure.repository;

import com.juandaabril.users.core.domain.User;
import com.juandaabril.users.core.domain.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpringDataUserRepository implements UserRepository {

    private SpringDataCrudUserRepository repository;

    public SpringDataUserRepository(SpringDataCrudUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(User user) {
        this.repository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return this.repository.findByEmail(email);
    }

    @Override
    public Optional<User> findById(Long userId) {
        return this.repository.findById(userId);
    }

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }
    @Override
    public void deleteById(Long userId) {
        this.repository.deleteById(userId);
    }
}
