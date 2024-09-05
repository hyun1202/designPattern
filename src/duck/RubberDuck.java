package duck;

import duck.behavior.Quackable;

// 슈퍼클래스에서 quack 함수와 fly 함수가 삭제되었으므로 반영해주어야 한다.
public class RubberDuck extends Duck implements Quackable {
    /**
     * 고무오리는 꽥꽥 소리 대신 삑삑 소리를 낸다.
     */
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    // 고무오리는 날지 못하므로 fly 함수를 오버라이드해준다.
//    @Override
//    void fly() {
//    }

    @Override
    void display() {
        System.out.println("RubberDuck");
    }
}
