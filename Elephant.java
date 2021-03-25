package com.qa.animal;

public class Elephant extends Animal {

    private String colour = "grey";
    private int age = 45;
    private int trunk = 1;

    public void makeNoise() {
        System.out.println("Trumpets");
    }

    public void fight() {
        System.out.println("Playfights");
    }
}