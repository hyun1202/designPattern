package duckSimulator.duck;

import duckSimulator.fly.FlyWithWings;
import duckSimulator.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }
}
