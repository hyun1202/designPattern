package ch12.decorator;

import ch12.Quackable;

public class QuackCount implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        numberOfQuacks++;
        duck.quack();
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
