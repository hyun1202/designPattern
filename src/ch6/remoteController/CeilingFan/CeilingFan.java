package ch6.remoteController.CeilingFan;

public class CeilingFan {
    public enum Status {
        OFF, LOW, MEDIUM, HIGH
    }

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = Status.OFF.ordinal();
    }

    public void high() {
        speed = Status.HIGH.ordinal();
        System.out.println("ceilingFan High");
    }

    public void medium() {
        speed = Status.MEDIUM.ordinal();
        System.out.println("ceilingFan Medium");
    }

    public void low() {
        speed = Status.LOW.ordinal();
        System.out.println("ceilingFan Low");
    }

    public void off() {
        speed = Status.OFF.ordinal();
        System.out.println("ceilingFan Off");
    }

    public int getSpeed() {
        return speed;
    }
}
