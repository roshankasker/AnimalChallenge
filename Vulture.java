package com.qa.animal;

public class Vulture extends Animal implements Animal_Interface_1 {

    private String colour = "Brown";
    private int age = 4;
    private int wingspan = 170;

    public void makeNoise(){
        System.out.println("Hiss");
    }
    private boolean fly = true;

    /* getters and setters
       getters = readOnly
       setters = WriteOnly */
    public boolean getFly(){
        return fly;
    }

    public void setFly(boolean newValueOfFly) {this.fly = newValueOfFly; }
    public void fly(){
        System.out.println("Vulture Flying: " + getFly() + ", Wingspan: " + this.wingspan);
    }
    public void finishLeftovers() {System.out.println("Finish leftovers"); }
}