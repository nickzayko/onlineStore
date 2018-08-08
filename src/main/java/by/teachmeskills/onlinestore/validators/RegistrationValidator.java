package by.teachmeskills.onlinestore.validators;

import by.teachmeskills.onlinestore.dto.UserDTO;
import by.teachmeskills.onlinestore.service.ProfileService;
import by.teachmeskills.onlinestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegistrationValidator implements Validator {

    @Autowired
    private UserService userService;

    @Autowired
    private ProfileService profileService;

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object object, Errors errors) {
        UserDTO userDTO = (UserDTO) object;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "loginUserDTO", "Error login");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordUserDTO", "Error password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstNameUserDTO", "Error firstName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastNameUserDTO", "Error lastName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailUserDTO", "Error email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sexUserDTO", "Error sex");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateOfBirthUserDTO", "Error dateOfBirth");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telephoneNumberUserDTO", "Error telephone");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryUserDTO", "Error country");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "regionUserDTO", "Error region");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cityUserDTO", "Error city");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "streetUserDTO", "Error street");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "buildNumberUserDTO", "Error buildNumber");

//        if (!errors.hasFieldErrors("loginUserDTO")){
//            if (userService.)
//        }

    }
}
