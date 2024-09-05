package duck;

public class Duck {
    void quack() {
        System.out.println("꽥꽥");
    }

    void swim() {
        System.out.println("헤엄");
    }

    void print() {
        quack();
        swim();
        display();
        System.out.println();
    }

    void display() {
        System.out.println("duck");
    }
}
