package ch12;

import ch12.adapter.GooseAdapter;
import ch12.decorator.QuackCount;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCount(new MallardDuck());
        Quackable redheadDuck = new QuackCount(new RedheadDuck());
        Quackable duckCall = new QuackCount(new DuckCall());
        Quackable rubberDuck = new QuackCount(new RubberDuck());
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\n 오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("오리가 소리 낸 횟수: " +
                QuackCount.getQuacks() + " 번");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
