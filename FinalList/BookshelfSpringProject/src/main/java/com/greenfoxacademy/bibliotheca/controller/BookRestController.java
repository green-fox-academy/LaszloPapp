package com.greenfoxacademy.bibliotheca.controller;
import com.greenfoxacademy.bibliotheca.model.JasonResponse;
import com.greenfoxacademy.bibliotheca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @Autowired
    BookRepository bookRepo;

    @RequestMapping(value = "/api/search/{author}", method = RequestMethod.GET)
    public JasonResponse ApiGetByAuthor(@PathVariable String author){
        return new JasonResponse(bookRepo.findAllByAuthor(author));
    }
}
