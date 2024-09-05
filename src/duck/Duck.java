package duck;

/**
 * 요구사항 추가!
 * 1. 오리는 날 수 있어야 한다.
 */
public class Duck {
    void quack() {
        System.out.println("꽥꽥");
    }

    void swim() {
        System.out.println("헤엄");
    }

    void fly() {
        System.out.println("오리 난다");
    }

    void print() {
        quack();
        swim();
        fly();
        display();
        System.out.println();
    }

    void display() {
        System.out.println("duck");
    }
}
