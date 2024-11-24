package ch12.decorator;

import ch12.Quackable;
import ch12.observer.Observer;

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

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
