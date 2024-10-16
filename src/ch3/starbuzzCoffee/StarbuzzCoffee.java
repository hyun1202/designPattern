package ch3.starbuzzCoffee;

import ch3.starbuzzCoffee.beverages.Beverage;
import ch3.starbuzzCoffee.beverages.Espresso;
import ch3.starbuzzCoffee.beverages.HouseBlend;
import ch3.starbuzzCoffee.beverages.decorator.Milk;
import ch3.starbuzzCoffee.beverages.decorator.Whip;

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

        // 사이즈 변경 및 우유와 휘핑크림 추가
        beverage = new Espresso(Beverage.Size.VENTI);
        beverage = new Whip(new Milk(beverage));

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 1.99 + .10 + .10 +
        // 크기 값 .6 + .4 + .2
    }
}
