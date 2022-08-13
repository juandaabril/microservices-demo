package com.juandaabril.users.core.actions;

import com.juandaabril.users.core.domain.User;
import com.juandaabril.users.core.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.juandaabril.users.core.domain.User.*;

@Service
@Transactional
public class DeleteUser {

    private UserRepository userRepository;

    public DeleteUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void invoke(Long userId) {
        verifyThatUserExists(userId);

        this.userRepository.deleteById(userId);
    }

    private void verifyThatUserExists(Long userId) {
        Optional<User> user = this.userRepository.findById(userId);

        if (user.isEmpty()) {
            throw new UserNotFound();
        }
    }
}
