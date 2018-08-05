package by.teachmeskills.onlinestore.service;

import by.teachmeskills.onlinestore.dao.UserRepository;
import by.teachmeskills.onlinestore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.QueryMethod;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService  {

    @Autowired
    UserRepository userRepository;


    public void save(User user) {
        userRepository.save(user);
    }

    public User getUserByName(String name){
        return userRepository.getUserByName(name);
    }


}
