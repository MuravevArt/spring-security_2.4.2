package org.muravev.service;

import org.muravev.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    List<Role> getAllRoles();

    Role findByName(String name);

    void saveRole(Role role);
}
