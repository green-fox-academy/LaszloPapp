package com.greenfoxacademy.bibliotheca.model;

import java.util.List;

public class JasonResponse {

    String result;
    List<BookShelf> data;

    public JasonResponse() {
    }

    public JasonResponse(List<BookShelf> data) {
        this.result = "ok";
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<BookShelf> getData() {
        return data;
    }

    public void setData(List<BookShelf> data) {
        this.data = data;
    }
}
