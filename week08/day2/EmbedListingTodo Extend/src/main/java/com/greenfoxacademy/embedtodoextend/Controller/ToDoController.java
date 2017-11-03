package com.greenfoxacademy.embedtodoextend.Controller;
import com.greenfoxacademy.embedtodoextend.Modell.ToDo;
import com.greenfoxacademy.embedtodoextend.Repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
//@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoRepo toDoRepo;
    ToDo toDo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String land(Model model) {
        model.addAttribute("list", toDoRepo.findAll());
        return "todoslist";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "redirect:/";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("add", new ToDo());
        return "addTodo";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute ToDo toDo) {
        toDoRepo.save(toDo);
        return "redirect:/";
    }

    @RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable long id) {
        toDoRepo.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("edit", toDoRepo.findOne(id));
        return "editTodo";
    }

    @RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
    public String editSave(@PathVariable Long id, @ModelAttribute ToDo toDo) {
        toDoRepo.save(toDo);
        return "redirect:/";
    }



/*
    @RequestMapping("/list")
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list", toDoRepo.findAll());
        return "todoslist";
    }

    @PostMapping("/list")
    public String save(@ModelAttribute ToDo toDo){
            toDoRepo.save(toDo);
            return "redirect:/todo/list";
    }

  //  @GetMapping("/add")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add ( Model model){
        model.addAttribute("add", new ToDo());
        System.out.println(toDoRepo.findAll());
        return "addTodo";
    }

    @DeleteMapping(value = "/{id}/delete")
    public String delete(@PathVariable long id){
        toDoRepo.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public  String edit(@PathVariable long id, Model model){
        model.addAttribute("edit", toDoRepo.findOne(id));
        return "editTodo";
    } */

    }

