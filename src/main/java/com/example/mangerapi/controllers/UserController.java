package com.example.mangerapi.controllers;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangerapi.models.User;
import com.example.mangerapi.services.UserService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")   
@RequestMapping("/users")
public class UserController {
private final  UserService userService;
public UserController(UserService userService) {
    this.userService = userService;
}
@GetMapping("/api/v1/all/users")
public ResponseEntity<List<User>> getUsers(){
    return ResponseEntity.ok().body(userService.getUsers());    
}}