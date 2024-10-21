package ch6.remoteController.CeilingFan;

import ch6.remoteController.Command;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // 작업 취소를 위해 현재 상태를 저장
        prevSpeed = ceilingFan.getSpeed();
        // 이후 변경
        ceilingFan.high();
    }

    //
    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.Status.HIGH.ordinal()) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.Status.MEDIUM.ordinal()) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.Status.LOW.ordinal()) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.Status.OFF.ordinal()) {
            ceilingFan.off();
        }
    }
}
