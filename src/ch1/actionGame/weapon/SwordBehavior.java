package ch1.actionGame.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두른다");
    }
}
