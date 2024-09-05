package ch1.actionGame.model.character;

import ch1.actionGame.model.Character;
import ch1.actionGame.weapon.KnifeBehavior;
import ch1.actionGame.weapon.SwordBehavior;

public class King extends Character {
    public King() {
        setWeaponBehavior(new SwordBehavior());
    }
}
