package by.teachmeskills.onlinestore.controllers;

import by.teachmeskills.onlinestore.dto.UserDTO;
import by.teachmeskills.onlinestore.entity.Address;
import by.teachmeskills.onlinestore.entity.Profile;
import by.teachmeskills.onlinestore.entity.User;
import by.teachmeskills.onlinestore.service.AddressService;
import by.teachmeskills.onlinestore.service.ProfileService;
import by.teachmeskills.onlinestore.service.UserService;
import by.teachmeskills.onlinestore.validators.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private ProfileService profileService;

    @Autowired
    private RegistrationValidator registrationValidator;


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String goToRegistrationPage(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("idUser") == null){
            model.addAttribute("result", "");
            model.addAttribute("userDTO", new UserDTO());

            model.addAttribute("loginUserDTO", "");
            model.addAttribute("passwordUserDTO", "");
            model.addAttribute("firstNameUserDTO", "");
            model.addAttribute("lastNameUserDTO", "");
            model.addAttribute("emailUserDTO", "");
            model.addAttribute("sexUserDTO", "");
            model.addAttribute("dateOfBirthUserDTO", "");
            model.addAttribute("telephoneNumberUserDTO", "");
            model.addAttribute("countryUserDTO", "");
            model.addAttribute("regionUserDTO", "");
            model.addAttribute("cityUserDTO", "");
            model.addAttribute("streetUserDTO", "");
            model.addAttribute("buildNumberUserDTO", "");
            return "registration";
        } else {
            return "redirect:/";
        }

    }

    @RequestMapping(value = "/registration/save", method = RequestMethod.POST)
    public String saveRegisteredUser(Model model, HttpSession httpSession,
                                     @ModelAttribute("userDTO") UserDTO userDTO,
                                     BindingResult bindingResult) {
        registrationValidator.validate(userDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("result", "error");
            model.addAttribute("userDTO", new UserDTO());
            return "registration";
        } else {

//            раскладываю userDTO на три объекта: user, profile, address
            User user = new User();
            Profile profile = new Profile();
            Address address = new Address();

            //заполнили поля объекта address
            address.setCountry(userDTO.getCountryUserDTO());
            address.setRegion(userDTO.getRegionUserDTO());
            address.setCity(userDTO.getCityUserDTO());
            address.setStreet(userDTO.getStreetUserDTO());
            address.setBuildNumber(userDTO.getBuildNumberUserDTO());
            addressService.saveAddress(address);

            int idAddress = addressService.getIdAddress(address.getCountry(), address.getRegion(),
                    address.getCity(), address.getStreet(), address.getBuildNumber());

            //заполняю поля объекта profile
            profile.setFirstName(userDTO.getFirstNameUserDTO());
            profile.setLastName(userDTO.getLastNameUserDTO());
            profile.setEmail(userDTO.getEmailUserDTO());
            profile.setSex(userDTO.getSexUserDTO());
            profile.setTelephoneNumber(userDTO.getTelephoneNumberUserDTO());
            profile.setDateOfBirth(userDTO.getDateOfBirthUserDTO());
            profile.setIdAddress(idAddress);
            profileService.saveProfile(profile);

            int idProfile = profileService.getIdProfile(idAddress);

            //заполняю поля объекта user
            user.setLogin(userDTO.getLoginUserDTO());
            user.setPassword(userDTO.getPasswordUserDTO());
            user.setIdProfile(idProfile);
            userService.saveUser(user);

            int idUser = userService.getIdUser(idProfile);

            httpSession.setAttribute("idUser", idUser);
        }
        return "redirect:/";
    }
}
