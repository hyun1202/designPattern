package duck;

public class DuckSimulation {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.print();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.print();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.print();
    }
}