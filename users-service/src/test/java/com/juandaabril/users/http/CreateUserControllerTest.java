package com.juandaabril.users.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juandaabril.users.core.actions.CreateUser;
import com.juandaabril.users.core.domain.User;
import com.juandaabril.users.core.domain.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static com.juandaabril.users.http.CreateUserController.UserRequest;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CreateUserController.class)
@Import({CreateUser.class})
class CreateUserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void shouldCreateANewUser() throws Exception {
        UserRequest request = new UserRequest();
        request.email = "jhon@gmail.com";
        request.password = "123456";
        doNothing().when(userRepository).save(isA(User.class));

        this.mockMvc.perform(post("/api/user/create-user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request))
        ).andDo(print()).andExpect(status().isOk());
    }

}