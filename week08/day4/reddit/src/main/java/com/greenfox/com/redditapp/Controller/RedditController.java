package com.greenfox.com.redditapp.Controller;
import com.greenfox.com.redditapp.Model.Post;
import com.greenfox.com.redditapp.Repository.PostRepo;
import com.greenfox.com.redditapp.service.PostProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class RedditController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    PostProvider postProvider;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String land(Model model) {
        model.addAttribute("list", postRepo.findAll());
        return "index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
    model.addAttribute("add", new Post());
    return "addpost";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute Post post){
        postRepo.save(post);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/increase", method = RequestMethod.GET)
    public String increase(@PathVariable Long id) {
        postProvider.increase(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/decrease", method = RequestMethod.GET)
    public String decrease(@PathVariable Long id) {
        postProvider.decrease(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable long id) {
        postRepo.delete(id);
        return "redirect:/";
    }

}
