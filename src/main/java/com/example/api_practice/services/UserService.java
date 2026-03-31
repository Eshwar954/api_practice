package com.example.api_practice.services;

import java.util.*;
import java.util.stream.*;

import org.springframework.stereotype.Service;

import com.example.api_practice.DTO.RequestDTO;
import com.example.api_practice.DTO.ResponseDTO;
import com.example.api_practice.model.User;
import com.example.api_practice.respository.UserRepository;
import com.example.api_practice.exception.DuplicateResourceException;
import com.example.api_practice.exception.ResourceNotFoundException;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public ResponseDTO createUser(RequestDTO request) {

        repo.findByEmail(request.getEmail()).ifPresent(u -> {
            throw new DuplicateResourceException("Email already exists");
        });

        User user = User.builder()
        .name(request.getName())
        .email(request.getEmail())
        .password(request.getPassword())
        .build();

        User saved = repo.save(user);

        return new ResponseDTO(saved.getId(), saved.getName(), saved.getEmail());
    }

    public List<ResponseDTO> getAllUsers() {
        return repo.findAll()
                .stream()
                .map(u -> new ResponseDTO(u.getId(), u.getName(), u.getEmail()))
                .collect(Collectors.toList());
    }

    public ResponseDTO getUserById(Long id) {
        User user = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        return new ResponseDTO(user.getId(), user.getName(), user.getEmail());
    }
}