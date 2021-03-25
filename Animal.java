package com.qa.animal;

public abstract class Animal {

    public String colour;
    public int eyes = 2;
    public int age;

    public void makeNoise() {
        System.out.println("Noise");
    }

    public void move() {
        System.out.println("Moving");
    }
}