package org.muravev.config;


import org.muravev.models.Role;
import org.muravev.models.User;
import org.muravev.service.RoleService;
import org.muravev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @PostConstruct
    private void init() {
        Role role1 = new Role("ADMIN");
        Role role2 = new Role("USER");
        roleService.saveRole(role1);
        roleService.saveRole(role2);
        Set<Role> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);

        User user = new User("artem@mail.ru", "artem", "Artem", "Muravev", (byte) 26,
                Collections.singleton(roleService.findByName("ADMIN")));
        User user1 = new User("anna@mail.ru", "anna", "Anna", "Muraveva", (byte) 30,
                Collections.singleton(roleService.findByName("USER")));
        User user2 = new User("test@mail.ru", "test", "Test", "Testovich", (byte) 3,
                roles);

        userService.save(user);
        userService.save(user1);
        userService.save(user2);
    }
}
