package ch1.duckSimulator.quack;

import ch1.duckSimulator.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
