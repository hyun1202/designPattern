package ch12.adapter;

import ch12.Goose;
import ch12.Quackable;
import ch12.observer.Observable;
import ch12.observer.Observer;

public class GooseAdapter implements Quackable {
    Observable observable;
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
