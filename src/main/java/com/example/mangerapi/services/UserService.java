package com.example.mangerapi.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mangerapi.models.User;
import com.example.mangerapi.repository.UserRepo;

@Service
public class UserService {

    private final UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}