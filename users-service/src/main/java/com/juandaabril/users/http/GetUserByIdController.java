package com.juandaabril.users.http;

import com.juandaabril.users.core.actions.GetUserById;
import com.juandaabril.users.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserByIdController {

    @Autowired
    private GetUserById getUserById;

    @GetMapping("/api/user/get-user-by-id/{id}")
    public User handle(@PathVariable Long id) {
        return this.getUserById.invoke(id);
    }
}
