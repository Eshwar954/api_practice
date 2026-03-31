package com.example.api_practice.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDTO {

    @NotBlank(message = "Name is Required")
    @Size(min = 3,message = "Name must be atleast 3 characters")
    private String name;

    @Email(message = "Invalid Email format")
    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "Password is Required")
    @Size(min=6,message = "Password must be atleast 6 Characters")
    private String password;
}
