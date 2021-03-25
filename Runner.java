package com.qa.animal;

public class Runner {

    public static void main(String[] args){
        Lion lion = new Lion();
        lion.hunt();
        lion.makeNoise();
        lion.eatMeat();
        Fish fish = new Fish();
        fish.swim();
        Vulture vulture = new Vulture();
        vulture.fly();
    }
}