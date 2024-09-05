package duckSimulator.quack;

import duckSimulator.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
