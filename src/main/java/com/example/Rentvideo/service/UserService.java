package com.example.Rentvideo.service;

import com.example.Rentvideo.entity.Role;
import com.example.Rentvideo.entity.User;
import com.example.Rentvideo.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    private final UserRepository userRepo;


    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepo, PasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }


    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        if (user.getRole() == null) user.setRole(Role.CUSTOMER);
        return userRepo.save(user);
    }
}
