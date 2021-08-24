package org.muravev.dao;

import org.muravev.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {

    List<Role> getAllRoles();

    Role findByName(String name);

    void saveRole(Role role);
}
