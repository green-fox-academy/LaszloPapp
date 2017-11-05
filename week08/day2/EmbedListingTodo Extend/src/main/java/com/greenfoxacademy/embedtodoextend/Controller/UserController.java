package com.greenfoxacademy.embedtodoextend.Controller;
import com.greenfoxacademy.embedtodoextend.Modell.User;
import com.greenfoxacademy.embedtodoextend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute User user){
        return "redirect:/" + userService.login("laci",user);
    }

    @RequestMapping(value = "/accessDenied/", method = RequestMethod.GET)
    public String accesDenied() {
        return "accessDenied";
    }
}
