package duck;

public class DuckSimulation {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.print();
         // Duck에는 fly 함수가 없으므로 날 수 없다.
        // mallardDuck.fly();

        // 해당 오리로 변환해주어야 한다.
        ((MallardDuck) mallardDuck).fly();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.print();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.print();

        // 고무오리는 날 수 없다.
        // ((RubberDuck) rubberDuck).fly();
        ((RubberDuck) rubberDuck).quack();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.print();

        // 나무오리는 소리를 낼 수 없다
        //((DecoyDuck) decoyDuck).quack();
    }
}