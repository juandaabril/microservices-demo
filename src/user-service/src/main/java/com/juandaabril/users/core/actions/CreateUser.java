package com.juandaabril.users.core.actions;

import com.juandaabril.users.core.domain.User;
import com.juandaabril.users.core.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CreateUser {

    private UserRepository userRepository;

    public CreateUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void invoke(String email, String password) {
        verifyThatEmailDoesNotExists(email);
        User user = User.create(email, password);

        this.userRepository.save(user);
    }

    private void verifyThatEmailDoesNotExists(String email) {
        Optional<User> user = this.userRepository.findByEmail(email);
        if (user.isPresent()) {
            throw new EmailAlreadyTaken();
        }

    }

    public static class EmailAlreadyTaken extends RuntimeException {}
}

