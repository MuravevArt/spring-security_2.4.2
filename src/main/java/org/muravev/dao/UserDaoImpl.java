package org.muravev.dao;

import org.hibernate.SessionFactory;
import org.muravev.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }
    @Override
    public User showUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void removeUser(Long id) {
        User user = sessionFactory.getCurrentSession().get(User.class, id);
        sessionFactory.getCurrentSession().delete(user);
    }
}
