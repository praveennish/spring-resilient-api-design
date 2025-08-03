package com.example.demo.service;

import com.example.demo.dto.CreateUserRequest;
import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class UserService
{
    private final List<User> users = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public List<User> getAllUsers()
    {
        return users;
    }

    public User createUser(CreateUserRequest request)
    {
        User user = new User(idGenerator.incrementAndGet(), request.getName(), request.getEmail());
        users.add(user);
        return user;
    }
}
