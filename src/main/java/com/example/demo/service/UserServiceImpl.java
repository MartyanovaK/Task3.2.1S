package com.example.demo.service;
import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public void UserDao(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }


    @Override
    public void add(User user) {
        userDao.add(user);
    }


    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }


    @Override
    public void edit(User user) {
        userDao.edit(user);
    }


    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }
}
