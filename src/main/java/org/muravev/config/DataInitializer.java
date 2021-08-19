package org.muravev.config;

import org.muravev.models.User;
import org.muravev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    @Autowired
    private UserService userService;

    @PostConstruct
    private void init() {
        User user = new User("artem@mail.ru", "artem", "Artem", "Muravev", (byte) 26);
        userService.save(user);

        User user1 = new User("anna@mail.ru", "anna", "Anna", "Muraveva", (byte) 30);
        userService.save(user1);

    }
}
