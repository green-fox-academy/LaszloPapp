package com.greenfoxacademy.foxclub;

public class Fox {

    String name;
    String food;
    String drink;
    String trick;

    public Fox(String name, String food, String drink, String trick) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.trick = trick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }
}
