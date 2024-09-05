package ch1.duckSimulator.duck;

import ch1.duckSimulator.fly.FlyWithWings;
import ch1.duckSimulator.quack.Quack;

public class MallardDuck extends Duck {

    // 인스턴스 변수 설정
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
