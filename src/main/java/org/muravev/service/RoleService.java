package org.muravev.service;

import org.muravev.models.Role;
import java.util.List;


public interface RoleService {

    List<Role> getAllRoles();

    Role findById(Long id);

    void saveRole(Role role);
}
