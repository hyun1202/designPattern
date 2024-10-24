package ch7.duck;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧게 나는 중");
    }
}
