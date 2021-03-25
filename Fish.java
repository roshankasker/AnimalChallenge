package com.qa.animal;

public class Fish extends Animal implements Animal_Interface {

    private String colour = "purple";
    private int age = 2;
    private int gills = 3;

    public void makeNoise() {
        System.out.println("Silence");
    }
    private boolean swim = true;

    /* getters and setters
       getters = readOnly
       setters = WriteOnly */
    public boolean getSwim() { return swim; }
    public int getGills() {return gills; }

    public void setSwim(boolean newValueOfFly) {this.swim = newValueOfFly; }
    public void swim(){
        System.out.println("Fish Swimming: " + getSwim() + ", Gills: " + getGills());
    }
}