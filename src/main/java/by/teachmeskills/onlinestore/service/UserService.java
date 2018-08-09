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
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public int getIdUser(int idProfile) {
        int id = userRepository.getIdUser(idProfile);
        return id;
    }

    public int getIdUser(User user) {
        int id = userRepository.getIdUser(user.getLogin(), user.getPassword());
        return id;
    }

    public String isLoginExist(String loginUserDTO) {
        return userRepository.isLoginExist(loginUserDTO);
    }


    public String isPasswordCorrect(String password) {
        return userRepository.isPasswordCorrect(password);
    }
}
