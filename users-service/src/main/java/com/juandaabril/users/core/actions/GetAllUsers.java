package com.juandaabril.users.core.actions;

import com.juandaabril.users.core.domain.User;
import com.juandaabril.users.core.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GetAllUsers {

    private UserRepository userRepository;

    public GetAllUsers(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> invoke(){
        return this.userRepository.findAll();
    }
}
