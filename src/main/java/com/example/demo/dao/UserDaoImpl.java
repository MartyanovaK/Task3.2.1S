package com.example.demo.dao;
import com.example.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("select u from User u",User.class).getResultList();

    }




    @Override
    public void add(User user) {
        entityManager.persist(user);
    }


    @Override
    public void delete(Long id) {
        User user = entityManager.find(User.class,  id);
        entityManager.remove(user);
    }

    @Override
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getById(Long id) {
        return entityManager.find(User.class,  id);
    }
}
