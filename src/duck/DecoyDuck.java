package duck;

public class DecoyDuck extends Duck{
    // 나무로된 가짜 오리는 소리를 낼 수가 없다.
    @Override
    void quack() {
    }

    // 날지도 못한다.
    @Override
    void fly() {
    }

    @Override
    void display() {
        System.out.println("DecoyDuck");
    }
}
