package com.greenfoxacademy.embedtodoextend.Modell;
import javax.persistence.*;

@Entity
public class ToDo {

    public ToDo() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String title;
    boolean isUrgent = false;
    boolean isDone = false;

    public ToDo(String s) {
        this.title = s;
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
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return id + " " + title;
    }
}