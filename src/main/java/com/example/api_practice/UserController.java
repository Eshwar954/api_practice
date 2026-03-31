package com.example.api_practice;

import com.example.api_practice.DTO.RequestDTO;
import com.example.api_practice.services.UserService;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewPage(Model model) {
        model.addAttribute("user", new RequestDTO());
        model.addAttribute("users", service.getAllUsers());
        return "users";
    }

    @PostMapping("/users")
    public String createUser(
            @Valid @ModelAttribute("user") RequestDTO request,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", service.getAllUsers());
            return "users";
        }

        service.createUser(request);
        return "redirect:/";
    }
}