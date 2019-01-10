package com.example.alex.test.cat;

/**
 * Кот-копилка.
 * Так как это неодушевленный предмет, он умеет только отображаться (display).
 * Имплементация метода display - своя.
 */
public class PiggyBankCat extends Cat {

    @Override
    public void display() {
        //display implementation

        System.out.println("Piggy bank cat is displayed, it can keep money");
    }

    @Override
    public void purr() {
        //do nothing
        System.out.println("This cat does not purr!");
    }

    @Override
    public void meow() {
        //do nothing

        System.out.println("This cat does not mew!");
    }

    @Override
    public void jump() {
        //do nothing

        System.out.println("This cat does not jump!");
    }
}