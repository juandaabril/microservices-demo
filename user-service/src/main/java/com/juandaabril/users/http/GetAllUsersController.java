package com.juandaabril.users.http;

import com.juandaabril.users.core.actions.GetAllUsers;
import com.juandaabril.users.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllUsersController {

    @Autowired
    private GetAllUsers getAllUsers;

    @GetMapping("/api/user/get-all-users")
    public List<User> handle() {
        return this.getAllUsers.invoke();
    }
}
