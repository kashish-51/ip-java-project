package com.example.registrationandpublicity.service;

import com.example.registrationandpublicity.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);  // Existing method
    User findUserById(Long id);    // Existing method
    List<User> findAllUsers();     // New method to retrieve all users
    void deleteUserById(Long id);  // New method to delete a user
}
