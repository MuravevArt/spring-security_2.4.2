package org.muravev.service;

import org.muravev.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getById(Long id);

    void save(User user);

    void delete(Long id);
}
