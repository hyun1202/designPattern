package ch6.remoteController;

public class RemoteController {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light("Living Room");
        Light light2 = new Light("Kitchen");
        LightOnCommand livingRoomLightOn = new LightOnCommand(light);
        LightOnCommand kitchenLightOn = new LightOnCommand(light2);

        LightOffCommand livingRoomLightOff = new LightOffCommand(light);
        LightOffCommand kitchenLightOff = new LightOffCommand(light2);

        Stereo stereo = new Stereo();

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, stereoOn, stereoOff);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.onButtonWasPushed(2);

        remote.offButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);
    }
}
