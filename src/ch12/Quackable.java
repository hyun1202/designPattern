package ch12;

import ch12.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
