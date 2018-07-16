package by.teachmeskills.onlinestore.controllers;

        import by.teachmeskills.onlinestore.entity.User;
        import by.teachmeskills.onlinestore.service.UserServiceImpl;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;

public class AuthorizationController {

    @Autowired
    public UserServiceImpl userService;

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public String authorization (Model model,
                                 @ModelAttribute("userEntity")User user){
        user = userService.getUserByLoginAndPassword(user.getLogin(), user.getPassword());
        if (user == null){
            model.addAttribute("result", "User not found!");
        } else {
            model.addAttribute("result", "good!");
        }

        return "index";
    }

}
