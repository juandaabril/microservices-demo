package com.juandaabril.users.http;

import com.juandaabril.users.core.actions.CreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    @Autowired
    private CreateUser createUser;

    @PostMapping("/api/user/create-user")
    public void handle(@RequestBody UserRequest request) {
        this.createUser.invoke(request.email, request.password);
    }

    public static class UserRequest {
        public String email;
        public String password;

    }
}
