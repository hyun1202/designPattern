package duck;

public class RubberDuck extends Duck {
    /**
     * 고무오리는 꽥꽥 소리 대신 삑삑 소리를 낸다.
     */
    @Override
    void quack() {
        System.out.println("삑삑");
    }

    // 고무오리는 날지 못하므로 fly 함수를 오버라이드해준다.
    @Override
    void fly() {
    }

    @Override
    void display() {
        System.out.println("RubberDuck");
    }
}
