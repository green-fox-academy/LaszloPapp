package com.greenfoxacademy.restfirst.model;

public class DoubleObject {

    int input;
    int result;

    public DoubleObject(int input) {
        this.input = input;
        this.result = input * 2;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
