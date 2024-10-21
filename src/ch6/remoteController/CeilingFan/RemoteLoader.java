package ch6.remoteController.CeilingFan;

import ch6.remoteController.RemoteControlWithUndo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(1, ceilingFanHigh, ceilingFanOff);

        // 속도를 중간으로 설정
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);

        // 다시 medium으로 설정
        remote.undoButtonWasPushed();

        // 속도를 high로 설정
        remote.onButtonWasPushed(1);
        System.out.println(remote);
        remote.undoButtonWasPushed();
    }
}
