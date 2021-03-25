package com.qa.animal;

public class Lion extends Animal {

    private String colour = "orange";
    private int age = 12;
    private int mane = 1;

    @Override
    public void makeNoise() {
        System.out.println("ROAR");
    }

    public void hunt() {System.out.println("Hunting"); }

    public void eatMeat() {System.out.println("Eats meat"); }

}