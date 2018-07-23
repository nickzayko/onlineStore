package by.teachmeskills.onlinestore.service;

import by.teachmeskills.onlinestore.dao.UserDaoImpl;
import by.teachmeskills.onlinestore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    public UserDaoImpl userDaoImpl;

    public User getUserByLoginAndPassword(String login, String password) {
        return userDaoImpl.getUserByLoginAndPassword(login, password);
    }
}
