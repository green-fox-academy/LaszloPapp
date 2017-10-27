package com.greenfoxacademy.springstart.model;

public class BankAccount {

    String name;
    String balance;
    String animalType;
    boolean isKing;
    boolean isGoodGuy;

    public BankAccount(String name, String balance, String animalType, boolean isKing,boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public void setGoodGuy(boolean goodGuy) {
        isGoodGuy = goodGuy;
    }

    public void accountToString(String name, String balance, String animalType){
        System.out.println(name + balance + animalType);
    }
}
