package ch10;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        // 동전 투입
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한개만");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전 투입");
        } else if (state == SOLD_OUT) {
            System.out.println("매진");
        } else if (state == SOLD) {
            System.out.println("알맹이를 내보내는 중");
        }
    }

    public void ejectQuarter() {
        // 동전 반환
    }

    public void turnCrank() {
        // 손잡이 돌리기
    }

    public void dispense() {
        // 알맹이 내보내기
    }
}
