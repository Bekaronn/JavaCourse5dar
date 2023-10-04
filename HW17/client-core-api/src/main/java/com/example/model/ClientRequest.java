package com.example.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
    private String clientId;
    @NotNull(message = "Name can not be empty")
    private String name;
    @NotNull(message = "Surname can not be empty")
    private String surname;
    @Email(message = "Incorrect email")
    private String email;
}
