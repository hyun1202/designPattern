package ch1.duckSimulator.quack;

import ch1.duckSimulator.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // 소리를 낼 수 없으므로 아무 것도 하지 않는다.
    }
}
