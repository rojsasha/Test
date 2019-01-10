package com.example.alex.test.cat;

/**
 * Порода кошек, с короткими лапками.
 * Умеет: мурлыкать (purr), мяукать (meow), и прыгать Низко (jump, своя имплементация)
 * Имплементация метода display - своя.
 */
public class MunchkinCat extends Cat {

    @Override
    public void display() {
        //display implementation

        System.out.println("Munchkin cat is displayed, he has small paws");
    }

    @Override
    public void jump() {
        //jump implementation

        System.out.println("How does this cat jump? - Jumps low");
    }
}