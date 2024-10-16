package ch3.beverages.decorator;

import ch3.beverages.Beverage;

/*
    첨가물 클래스추가.
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    // 모든 첨가물 데코레이터에 해당 메소드를 새로 구현하도록 만들게 하기 위해 추상 메소드로 선언
    public abstract String getDescription();
}
