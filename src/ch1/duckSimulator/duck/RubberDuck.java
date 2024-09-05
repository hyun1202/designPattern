package ch1.duckSimulator.duck;

import ch1.duckSimulator.fly.FlyNoWay;
import ch1.duckSimulator.quack.Squeak;

// 슈퍼클래스에서 quack 함수와 fly 함수가 삭제되었으므로 반영해주어야 한다.
public class RubberDuck extends Duck {

    public RubberDuck() {
        // 꽥꽥 소리 대신 삑삑 소리를 낸다.
        quackBehavior = new Squeak();
        // 고무오리는 날지 못한다.
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
