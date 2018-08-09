package by.teachmeskills.onlinestore.controllers;

import by.teachmeskills.onlinestore.entity.User;
import by.teachmeskills.onlinestore.service.UserService;
import by.teachmeskills.onlinestore.validators.AuthorizationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class AuthorizationController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthorizationValidator authorizationValidator;

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public String authorization(Model model, HttpSession httpSession,
                                @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (httpSession.getAttribute("idUser") == null){
            authorizationValidator.validate(user, bindingResult);
            if (bindingResult.hasErrors()){
                model.addAttribute("result", "error");
                model.addAttribute("user", new User());
                return "index";
            } else {
                httpSession.setAttribute("idUser", userService.getIdUser(user));
                return "redirect:/";
            }
        } else {
            return "redirect:/";
        }



    }

}
