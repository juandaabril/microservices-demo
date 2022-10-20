package com.juandaabril.users.core.actions;

import com.juandaabril.users.core.domain.User;
import com.juandaabril.users.core.domain.User.UserNotFound;
import com.juandaabril.users.core.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class GetUserById {

    private UserRepository userRepository;

    public GetUserById(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User invoke(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty()) {
            throw new UserNotFound();
        }

        return user.get();
    }
}
