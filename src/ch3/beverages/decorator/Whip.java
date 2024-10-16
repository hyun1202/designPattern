package ch3.beverages.decorator;

import ch3.beverages.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
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
            case GRANDE -> .10 + .2;
            case VENTI -> .10 + .4;
        };
    }
}
