package ch3;

import ch3.beverages.Beverage;
import ch3.beverages.Espresso;
import ch3.beverages.HouseBlend;
import ch3.beverages.decorator.Milk;
import ch3.beverages.decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        // 기본 에스프레소
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new HouseBlend();
        // 우유 추가
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Whip(beverage);
        // 우유 + 휘핑크림 추가
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
