package com.example.mangerapi.controllers;

import com.example.mangerapi.models.User;
import com.example.mangerapi.services.UserService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing users.
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/users")
public final class UserController {

    /** Service for user operations. */
    private final UserService userService;

    /**
     * Constructor for UserController.
     * @param service the user service
     */
    public UserController(final UserService service) {
        this.userService = service;
    }

    /**
     * Retrieves all users.
     * @return list of all users
     */
    @GetMapping("/api/v1/all/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }
}
