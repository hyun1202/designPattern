package ch1.duckSimulator.fly;

import ch1.duckSimulator.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아감");
    }
}
