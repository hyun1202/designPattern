package ch1.duckSimulator.duck;

import ch1.duckSimulator.fly.FlyWithWings;
import ch1.duckSimulator.quack.Quack;

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
