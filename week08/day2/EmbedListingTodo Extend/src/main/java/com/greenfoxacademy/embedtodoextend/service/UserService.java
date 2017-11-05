package com.greenfoxacademy.embedtodoextend.service;
import com.greenfoxacademy.embedtodoextend.Modell.User;
import com.greenfoxacademy.embedtodoextend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String login(String name, User user) {
        if (user.getPassword().equals(userRepo.findUserByName(name).getPassword())) {
            return "/todo/todoslist";
        }else{
            return "/accessDenied/";
        }
    }
}
