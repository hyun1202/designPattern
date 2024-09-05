package ch1.actionGame.model.character;

import ch1.actionGame.model.Character;
import ch1.actionGame.weapon.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        setWeaponBehavior(new AxeBehavior());
    }
}
