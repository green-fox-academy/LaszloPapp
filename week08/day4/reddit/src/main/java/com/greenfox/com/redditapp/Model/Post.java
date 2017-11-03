package com.greenfox.com.redditapp.Model;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public int score;
    String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate date;


    public Post() {
        this.date = LocalDate.now();
    }

    public Post(int score, String content) {
        this.score = score;
        this.content = content;
        this.date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
