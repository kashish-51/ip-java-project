package com.example.registrationandpublicity.service.impl;

import com.example.registrationandpublicity.entity.User;
import com.example.registrationandpublicity.repository.UserRepository;
import com.example.registrationandpublicity.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);  // Save the user details
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);  // Find user by ID
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();  // Fetch all users
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);  // Delete user by ID
    }
}
