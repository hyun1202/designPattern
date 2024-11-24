package ch12.factory;

import ch12.*;
import ch12.decorator.QuackCount;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
