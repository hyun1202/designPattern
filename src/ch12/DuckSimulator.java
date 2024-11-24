package ch12;

import ch12.adapter.GooseAdapter;
import ch12.decorator.QuackCount;
import ch12.factory.AbstractDuckFactory;
import ch12.factory.CountingDuckFactory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
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
