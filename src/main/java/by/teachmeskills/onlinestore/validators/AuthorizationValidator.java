package by.teachmeskills.onlinestore.validators;

import by.teachmeskills.onlinestore.entity.User;
import by.teachmeskills.onlinestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AuthorizationValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "errorLogin");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "errorPassword");

        if (!errors.hasFieldErrors("login")){
            if (userService.isLoginExist(user.getLogin()) == null){
                errors.rejectValue("login", "wrongLogin");
            }
        }

        if (!errors.hasFieldErrors("password") && !errors.hasFieldErrors("login")){
            if (userService.isPasswordCorrect(user.getPassword()) == null){
                errors.rejectValue("password", "wrongPassword");
            }
        }
    }
}
