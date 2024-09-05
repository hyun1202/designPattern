package ch1.actionGame;

import ch1.actionGame.model.Character;
import ch1.actionGame.model.character.King;
import ch1.actionGame.model.character.Knight;
import ch1.actionGame.model.character.Queen;
import ch1.actionGame.model.character.Troll;

public class Game {
    public static void main(String[] args) {
        // 1. King 선택
        Character king = new King();
        king.fight();

        // 2. Knight 선택
        Character knight = new Knight();
        knight.fight();

        // 3. Queen 선택
        Character queen = new Queen();
        queen.fight();

        // 4. Troll 선택
        Character troll = new Troll();
        troll.fight();
    }
}
