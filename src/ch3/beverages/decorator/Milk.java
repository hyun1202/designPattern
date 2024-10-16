package ch3.beverages.decorator;

import ch3.beverages.Beverage;

public class Milk extends CondimentDecorator {
    // 데코레이트(감싸고자)하고자 하는 객체를 생성자로 받는다.
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
