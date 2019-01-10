package com.example.alex.test.cat;

/**
 * Базовый класс, который определяет базовое поведение всех котиков.
 */
public class Cat {
    public String jump = "Maine coon cat is displayed, it is very big";
    public String meow = "Does this cat meow? - Meow!";
    public String purr = "This cat can purr, mrrrrr...";

    /**
     * Данный метод, для каждого конкретного котика, должен быть свой.
     */
    public void display() {
        throw new UnsupportedOperationException();
    }

    public void purr() {
        System.out.println(purr);
    }

    public void meow() {
        System.out.println(meow);
    }

    public void jump() {
        System.out.println(jump);
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void setPurr(String purr) {
        this.purr = purr;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }
} 