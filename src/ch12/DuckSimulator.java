package ch12;

import ch12.adapter.GooseAdapter;
import ch12.composite.Flock;
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
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n 오리 시뮬레이션 게임: 무리 (+컴포지트)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\n 오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);

        System.out.println("\n 오리 시뮬레이션 게임: 물 오리 무리");
        simulate(flockOfMallards);

        System.out.println("오리가 소리 낸 횟수: " +
                QuackCount.getQuacks() + " 번");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
