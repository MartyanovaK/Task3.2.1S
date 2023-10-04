package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void add(User user);
    void delete (Long id);
    void edit(User user);
    User getById(Long id);
}
