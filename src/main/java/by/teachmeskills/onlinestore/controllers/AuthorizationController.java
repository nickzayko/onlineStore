package by.teachmeskills.onlinestore.controllers;

import by.teachmeskills.onlinestore.entity.User;
import by.teachmeskills.onlinestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthorizationController {

    @Autowired
    public UserService service;

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public String authorization(Model model,
                                @ModelAttribute("user") User user) {
//        if (user.getName().trim().length() == 0 && user.getPassword().isEmpty()) {
//            model.addAttribute("result", "User is empty!");
//            model.addAttribute("user", new User());
//        } else {
//
//            service.save(user);
//
//            model.addAttribute("result", "user saved");
//            model.addAttribute("user", new User());
//        }

        return "index";
    }

    @RequestMapping(value = "/getUserByName", method = RequestMethod.POST)
    public String getUserByName(Model model,
                                @RequestParam("name") String name) {
//        if (name.trim().length() == 0 && name.isEmpty()) {
//            model.addAttribute("result", "Name is empty!");
//            model.addAttribute("user", new User());
//        } else {
//
//            User user = service.getUserByName(name);
//            model.addAttribute("result", user.getPassword());
//            model.addAttribute("user", new User());
//        }

        return "index";
    }

}
