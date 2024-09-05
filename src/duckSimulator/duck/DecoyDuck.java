package duckSimulator.duck;

import duckSimulator.fly.FlyNoWay;
import duckSimulator.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        // 나무로된 가짜 오리는 소리를 낼 수가 없다.
        quackBehavior = new MuteQuack();
        // 날지도 못한다.
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }
}
