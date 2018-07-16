package by.teachmeskills.onlinestore.dao;

import by.teachmeskills.onlinestore.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;

@Repository
@Transactional
public class UserDaoImpl {

@Autowired
public SessionFactory sessionFactory;

    public User getUserByLoginAndPassword(String login, String password) {
        try {
            String userHQL = "FROM User WHERE login = :login AND password = :password";
            org.hibernate.query.Query query = sessionFactory.getCurrentSession().createQuery(userHQL);
            query.setParameter("login", login);
            query.setParameter("password", password);
            return (User) query.getSingleResult();
        } catch (NoResultException nre){
            System.out.println("User not found");
        }

        return null;
    }
}
