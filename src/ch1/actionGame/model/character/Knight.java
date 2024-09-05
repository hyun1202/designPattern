package ch1.actionGame.model.character;

import ch1.actionGame.model.Character;
import ch1.actionGame.weapon.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        setWeaponBehavior(new KnifeBehavior());
    }
}
