package by.teachmeskills.onlinestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//при старте проекта загружает index.jsp
@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "index";
    }
}
