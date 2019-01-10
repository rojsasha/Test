package com.example.alex.test.cat;

/**
 * Игрушечный пушистый котик
 * Умеет: отображаться (display) и мяукать (meow).
 * Имплементация метода display - своя.
 */
public class ToyCat extends Cat {

    public void display() {
        //display implementation

        System.out.println("Toy cat is displayed, it is soft");
    }

    @Override
    public void purr() {
        //do nothing

        System.out.println("This cat does not purr!");
    }

    @Override
    public void jump() {
        //do nothing

        System.out.println("This cat does not jump!");
    }
}