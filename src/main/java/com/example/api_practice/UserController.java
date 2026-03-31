package com.example.api_practice;

import com.example.api_practice.DTO.RequestDTO;
import com.example.api_practice.DTO.ResponseDTO;
import com.example.api_practice.services.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseDTO createUser(@Valid @RequestBody RequestDTO request) {
        return service.createUser(request);
    }

    @GetMapping
    public List<ResponseDTO> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseDTO getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }
}