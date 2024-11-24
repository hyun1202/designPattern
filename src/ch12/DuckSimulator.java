package ch12;

import ch12.adapter.GooseAdapter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\n 오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
