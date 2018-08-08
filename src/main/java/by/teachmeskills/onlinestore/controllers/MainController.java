package by.teachmeskills.onlinestore.controllers;

import by.teachmeskills.onlinestore.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


//при старте проекта загружает index.jsp
@Controller
public class MainController {
    @RequestMapping("/")
    public String main(Model model, HttpSession httpSession){
        if (httpSession.getAttribute("idUser") == null){
            model.addAttribute("user", new User());
            model.addAttribute("result","");
            return "index";
        } else {
            model.addAttribute("user", new User());
            model.addAttribute("result", "you are just registered or entered success!");
            return "index";
        }
    }
}
