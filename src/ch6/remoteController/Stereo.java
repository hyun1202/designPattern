package ch6.remoteController;

public class Stereo {
    int volume = 0;
    void on() {
        System.out.println("Stereo on");
    }

    void off() {
        System.out.println("Stereo off");
    }

    void setCd() {
        System.out.println("Stereo setCd");
    }

    void setDvd() {
        System.out.println("Stereo setDvd");
    }

    void setRadio() {
        System.out.println("Stereo setRadio");
    }

    void setVolume(int volume) {
        System.out.println("Stereo setVolume: " + volume);
        this.volume = volume;
    }
}
