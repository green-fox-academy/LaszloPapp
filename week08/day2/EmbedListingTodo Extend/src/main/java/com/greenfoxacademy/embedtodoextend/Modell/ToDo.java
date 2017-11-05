package com.greenfoxacademy.embedtodoextend.Modell;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    String title;
    Boolean urgent;
    Boolean done;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate date;

    public ToDo() {
        this.date = LocalDate.now();
        this.urgent = false;
        this.done = false;
    }

    public ToDo(String s) {
        this.title = s;
        this.urgent = false;
        this.done = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return id + " " + title;
    }
}