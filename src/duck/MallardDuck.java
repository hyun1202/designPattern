package duck;

import duck.behavior.Flyable;
import duck.behavior.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("MallardDuck");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리 난다");
    }
}
