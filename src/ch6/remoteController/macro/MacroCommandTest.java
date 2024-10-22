package ch6.remoteController.macro;

import ch6.remoteController.*;

public class MacroCommandTest {
    public static void main(String[] args) {
        // 버튼을 누르면 불이 켜지고, 라디오가 켜짐

        // 1. 커맨드 생성
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        MacroCommand macroOn = new MacroCommand(new Command[] {lightOn, stereoOn});
        MacroCommand macroOff = new MacroCommand(new Command[] {lightOff, stereoOff});

        // 매크로 등록 !
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        remote.setCommand(0, macroOn, macroOff);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        System.out.println("--- undo ---");
        remote.undoButtonWasPushed();
    }
}
