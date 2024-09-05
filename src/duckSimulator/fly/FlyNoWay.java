package duckSimulator.fly;

import duckSimulator.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 없음");
    }
}
