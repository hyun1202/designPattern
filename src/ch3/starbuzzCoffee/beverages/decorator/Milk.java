package ch3.starbuzzCoffee.beverages.decorator;

import ch3.starbuzzCoffee.beverages.Beverage;

public class Milk extends CondimentDecorator {
    // 데코레이트(감싸고자)하고자 하는 객체를 생성자로 받는다.
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + sizeCalc();
    }

    public double sizeCalc() {
        System.out.println("getSize() = " + getSize());
        System.out.println("beverage.getSize() = " + beverage.getSize());
        return switch (getSize()) {
            case TALL -> .10;
            case GRANDE -> .10 + .1;
            case VENTI -> .10 + .2;
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
