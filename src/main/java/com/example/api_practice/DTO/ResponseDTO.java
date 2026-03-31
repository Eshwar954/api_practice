package com.example.api_practice.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private Long id;
    private String name;
    private String email;
}