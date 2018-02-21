package com.greenfoxacademy.bibliotheca.model;

import java.util.List;

public class JasonResponse {

    String result;
    List<Book> data;

    public JasonResponse() {
    }

    public JasonResponse(List<Book> data) {
        this.result = "ok";
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Book> getData() {
        return data;
    }

    public void setData(List<Book> data) {
        this.data = data;
    }
}
