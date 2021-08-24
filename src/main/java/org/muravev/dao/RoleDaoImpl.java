package org.muravev.dao;

import org.muravev.models.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    @Override
    public Role findByName(String name) {
        return entityManager.createQuery("SELECT role FROM Role role where role.name=:name", Role.class)
                .setParameter("name", name).getSingleResult();
    }

    @Transactional
    @Override
    public void saveRole(Role role) {
        entityManager.persist(role);
    }
}
