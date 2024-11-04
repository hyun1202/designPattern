package ch10;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
        throw new RuntimeException("동전을 넣지 않았으므로 예외가 발생합니다.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }
}
