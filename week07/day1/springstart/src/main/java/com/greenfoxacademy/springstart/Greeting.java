package com.greenfoxacademy.springstart;

public class Greeting {

    long id;
    String content;
    String name;

    public Greeting(long id, String content, String name){
        this.id = id;
        this.content = content;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
