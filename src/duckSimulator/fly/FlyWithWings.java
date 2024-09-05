package duckSimulator.fly;

import duckSimulator.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("오리 난다");
    }
}
