package ch10;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();
    void refill();
}
