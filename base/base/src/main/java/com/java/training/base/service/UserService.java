package com.java.training.base.service;

import com.java.training.base.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    boolean deleteUserById(long id);
    User getUserById(long id);
    User updateUser(User student);
    User saveUser(User student);
}
