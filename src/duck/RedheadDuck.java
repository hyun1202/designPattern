package duck;

import duck.behavior.Flyable;
import duck.behavior.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("RedheadDuck");
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
