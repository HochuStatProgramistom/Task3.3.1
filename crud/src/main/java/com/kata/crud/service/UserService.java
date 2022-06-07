package com.kata.crud.service;

import com.kata.crud.entity.User;

import java.util.List;

public interface UserService {
    public User findById(Long id);

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);
}
