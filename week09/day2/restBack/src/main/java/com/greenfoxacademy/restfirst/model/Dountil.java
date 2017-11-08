package com.greenfoxacademy.restfirst.model;

public class Dountil {

    public int result;

    public Dountil(String method, int until) {
        if(method.equals("sum")){
            this.result = sum(until);
        }else if(method.equals("factor")){
            this.result = factor(until);
        }
    }

    public int factor(int input) {
        int factor = 1;
        for (int i = 1; i <= input; i++) {
            factor *= i;
        }
        return factor;
    }

    public int sum(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum;
    }


}
