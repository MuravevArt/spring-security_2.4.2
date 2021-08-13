package org.muravev.dao;

import org.muravev.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User showUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void removeUser(Long id);
}
