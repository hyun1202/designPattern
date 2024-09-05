package ch1.duckSimulator;

import ch1.duckSimulator.duck.*;
import ch1.duckSimulator.fly.FlyRocketPowered;

public class DuckSimulation {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.print();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.print();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.print();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.print();

        // 모형 오리 추가
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly(); // 날 수 없음
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly(); // 로켓 장착
    }
}