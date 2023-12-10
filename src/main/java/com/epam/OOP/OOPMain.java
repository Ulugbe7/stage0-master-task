package com.epam.OOP;

public class OOPMain {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal dog = new Dog();

        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription());
    }
}
