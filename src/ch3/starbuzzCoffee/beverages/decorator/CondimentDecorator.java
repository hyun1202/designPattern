package ch3.starbuzzCoffee.beverages.decorator;

import ch3.starbuzzCoffee.beverages.Beverage;

/*
    첨가물 클래스추가.
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    // 모든 첨가물 데코레이터에 해당 메소드를 새로 구현하도록 만들게 하기 위해 추상 메소드로 선언
    public abstract String getDescription();
    // 반드시 해당 음료의 size를 리턴하는 getSize() 메소드가 필요하다.
    // 없으면 데코레이터에 음료 사이즈를 가져올 수 없다.
    public Size getSize() {
        return beverage.getSize();
    }
}
