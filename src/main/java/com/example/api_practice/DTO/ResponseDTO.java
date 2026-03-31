package com.example.api_practice.DTO;

import lombok.AllArgsConstructor;
import lombok.*;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private Long id;
    private String name;
    private String email;
}
