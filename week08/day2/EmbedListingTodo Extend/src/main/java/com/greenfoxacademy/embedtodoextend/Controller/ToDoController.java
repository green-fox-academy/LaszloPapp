package com.greenfoxacademy.embedtodoextend.Controller;
import com.greenfoxacademy.embedtodoextend.Repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoRepo toDoRepo;

    @RequestMapping("/save")
    public String list(Model model){
        model.addAttribute("save", toDoRepo.findAll());
        return "todoslist";
    }

}
