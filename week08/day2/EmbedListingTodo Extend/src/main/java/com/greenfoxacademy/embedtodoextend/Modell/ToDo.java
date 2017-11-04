package com.greenfoxacademy.embedtodoextend.Modell;
import javax.persistence.*;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    String title;
    Boolean urgent;
    Boolean done;

    public ToDo() {
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