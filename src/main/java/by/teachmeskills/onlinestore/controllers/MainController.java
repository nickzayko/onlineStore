package by.teachmeskills.onlinestore.controllers;

import by.teachmeskills.onlinestore.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//при старте проекта загружает index.jsp
@Controller
public class MainController {
    @RequestMapping("/")
    public String main(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("result","");
        return "index";
    }
}
