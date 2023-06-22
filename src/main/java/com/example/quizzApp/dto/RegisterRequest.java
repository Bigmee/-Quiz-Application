package com.example.quizzApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotEmpty(message = "username should not be blank")
    private String username;

    @javax.validation.constraints.Pattern(regexp = "(\\w+@)(\\w+\\.com)", message = "wrong email format")
    private String  email;

    @NotEmpty(message = "password should not be blank")
    private String password;

    @NotEmpty(message = "confirm password should not be blank")
    private String confirmPassword;
}


