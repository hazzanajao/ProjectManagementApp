package com.projectmanagementappwithjwtspringsecurity.controller;

import com.projectmanagementappwithjwtspringsecurity.entity.User;
import com.projectmanagementappwithjwtspringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepo;

     @GetMapping("/info")
    public User getUserDetails(){

        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return userRepo.findByEmail(email).get();
    }

}
