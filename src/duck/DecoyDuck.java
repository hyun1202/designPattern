package duck;

public class DecoyDuck extends Duck {
    // 나무로된 가짜 오리는 소리를 낼 수가 없다.
//    @Override
//    void quack() {
//    }

    // 날지도 못한다.
    // 슈퍼클래스에서 fly 함수가 삭제되었으므로 서브클래스에서 삭제해주어야 한다.

    @Override
    void display() {
        System.out.println("DecoyDuck");
    }
}
