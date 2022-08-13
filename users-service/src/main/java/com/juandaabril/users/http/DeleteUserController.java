package com.juandaabril.users.http;

import com.juandaabril.users.core.actions.DeleteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteUserController {

    @Autowired
    private DeleteUser deleteUser;

    @DeleteMapping("/api/user/delete-user/{id}")
    public void handle(@PathVariable Long id) {
        this.deleteUser.invoke(id);
    }
}
