package org.muravev.dao;

import org.muravev.models.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role findById(Long id);

    void saveRole(Role role);
}
