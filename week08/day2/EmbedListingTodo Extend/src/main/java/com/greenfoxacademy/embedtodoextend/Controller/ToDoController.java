package com.greenfoxacademy.embedtodoextend.Controller;
import com.greenfoxacademy.embedtodoextend.Modell.ToDo;
import com.greenfoxacademy.embedtodoextend.Repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoRepo toDoRepo;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String land(Model model) {
        model.addAttribute("list", toDoRepo.findAll());
        return "todoslist";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("add", new ToDo());
        return "addTodo";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute ToDo toDo) {
        toDoRepo.save(toDo);
        return "redirect:/todo/";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable long id) {
        toDoRepo.delete(id);
        return "redirect:/todo/";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("edit", toDoRepo.findOne(id));
        return "editTodo";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
    public String editSave(@ModelAttribute ToDo toDo) {
        toDoRepo.save(toDo);
        return "redirect:/todo/";
    }
}

