package ch1.actionGame.model.character;

import ch1.actionGame.model.Character;
import ch1.actionGame.weapon.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        setWeaponBehavior(new BowAndArrowBehavior());
    }
}
