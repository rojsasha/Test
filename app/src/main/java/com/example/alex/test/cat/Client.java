package com.example.alex.test.cat;

import java.util.LinkedList;
import java.util.List;

/**
 * Оптимизируйте код так, чтобы можно было:
 * - безболезненно добавлять новые реализации котиков;
 * - динамически подменять поведения у котиков. (Пример: чтобы MaineCoonCat мог прыгать Низко)
 */
public class Client {
    private static MaineCoonCat maineCoonCat;
    private static MunchkinCat munchkinCat;
    private static PiggyBankCat piggyBankCat;
    private static ToyCat toyCat;

    private static void createCats() {
        maineCoonCat = new MaineCoonCat();
        munchkinCat = new MunchkinCat();
        piggyBankCat = new PiggyBankCat();
        toyCat = new ToyCat();

    }

    public static void main(String[] args) {
        createCats();
        maineCoonCat.setJump("adadads");

        List<Cat> cats = new LinkedList<>();
        cats.add(maineCoonCat);
        cats.add(munchkinCat);
        cats.add(piggyBankCat);
        cats.add(toyCat);


        for (Cat cat : cats) {
            cat.display();
            cat.purr();
            cat.meow();
            cat.jump();
            System.out.println();
        }
    }
}