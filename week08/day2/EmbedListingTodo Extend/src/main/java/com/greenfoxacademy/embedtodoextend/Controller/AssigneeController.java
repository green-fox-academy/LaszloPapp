package com.greenfoxacademy.embedtodoextend.Controller;
import com.greenfoxacademy.embedtodoextend.Modell.Assignee;
import com.greenfoxacademy.embedtodoextend.Modell.ToDo;
import com.greenfoxacademy.embedtodoextend.Repository.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

    @Autowired
    AssigneeRepo assigneeRepo;

    @RequestMapping(value = "/assignee",method = RequestMethod.GET)
    public String assigneeList(Model model){
        model.addAttribute("assignee", assigneeRepo.findAll());
        return "/assignee";
    }

    @RequestMapping(value = "/addass", method = RequestMethod.GET)
    public String addAssignee(Model model) {
        model.addAttribute("addAss", new Assignee());
        return "/addAssignee";
    }

    @RequestMapping(value = "/addass", method = RequestMethod.POST)
    public String addAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/todo/assignee";
    }

    @RequestMapping(value = "/{id}/deleteAss", method = RequestMethod.GET)
    public String delete(@PathVariable long id) {
        assigneeRepo.delete(id);
        return "redirect:/todo/assignee";
    }

    @RequestMapping(value = "/{id}/editAss", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("edit", assigneeRepo.findOne(id));
        return "/editAssignee";
    }

    @RequestMapping(value = "/{id}/editAss", method = RequestMethod.POST)
    public String editSave(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/todo/assignee";
    }
}
