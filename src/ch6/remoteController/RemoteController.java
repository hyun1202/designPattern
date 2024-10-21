package ch6.remoteController;

public class RemoteController {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light("Living Room");
        Light light2 = new Light("Kitchen");
//        LightOnCommand livingRoomLightOn = new LightOnCommand(light);
//        LightOnCommand kitchenLightOn = new LightOnCommand(light2);

//        LightOffCommand livingRoomLightOff = new LightOffCommand(light);
//        LightOffCommand kitchenLightOff = new LightOffCommand(light2);

        Stereo stereo = new Stereo();

//        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // Lambda 표현식으로 변경
        // 추상 메소드가 하나일 때만 사용 가능하다.
        // () -> light.on()을 light::on으로 변경 가능
        // remote.setCommand(0, () -> light.on(), () -> light.off());
        remote.setCommand(0, light::on, light::off);
        remote.setCommand(1, light2::on, light2::off);
        remote.setCommand(2, () -> {
            stereo.on();
            stereo.setCd();
            stereo.setVolume(11);
        }, stereo::off);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.onButtonWasPushed(2);

        remote.offButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);
    }
}
