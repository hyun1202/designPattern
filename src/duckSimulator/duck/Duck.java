package duckSimulator.duck;

import duckSimulator.behavior.FlyBehavior;
import duckSimulator.behavior.QuackBehavior;

/**
 * 요구사항 추가!
 * 1. 오리는 날 수 있어야 한다.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("헤엄");
    }

    public void print() {
        performQuack();
        performFly();
        swim();
        display();
        System.out.println();
    }

    public void display() {
        System.out.println("duckSimulator");
    }
}
