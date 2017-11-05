package com.greenfoxacademy.embedtodoextend.Controller;
import com.greenfoxacademy.embedtodoextend.Modell.Assignee;
import com.greenfoxacademy.embedtodoextend.Repository.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
}
