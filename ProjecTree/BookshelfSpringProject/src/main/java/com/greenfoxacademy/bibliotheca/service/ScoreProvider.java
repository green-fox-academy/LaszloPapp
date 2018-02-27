package com.greenfoxacademy.bibliotheca.service;
import com.greenfoxacademy.bibliotheca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreProvider {

    @Autowired
    BookRepository bookRepository;

    public void increase(Long id){
        bookRepository.findOne(id).setScore(bookRepository.findOne(id).score+1);
        bookRepository.save(bookRepository.findOne(id));
    }

    public void decrease(Long id){
        bookRepository.findOne(id).setScore(bookRepository.findOne(id).score-1);
        bookRepository.save(bookRepository.findOne(id));
    }
}
