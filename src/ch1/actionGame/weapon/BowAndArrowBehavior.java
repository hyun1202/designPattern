package ch1.actionGame.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("화살을 쏜다");
    }
}