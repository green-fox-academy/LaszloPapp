package com.greenfoxacademy.foxclub;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    Fox foxRezso = new Fox("Rezso", "ice cream","beer","sleep instantly");

    @GetMapping({"", "/"})
    public String index(Model model) {
        ArrayList<Fox> foxhole = new ArrayList<>();
        foxhole.add(foxRezso);
        model.addAttribute("fox", foxhole);
        return "index";
    }
}
