package org.muravev.dao;

import org.muravev.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getById(Long id);

    void save(User user);

    void delete(Long id);
}
