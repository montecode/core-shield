package me.montecode.coregame.game;

import me.montecode.coregame.framework.Screen;
import me.montecode.coregame.framework.impl.AndroidGame;

public class GameActivity extends AndroidGame {
    @Override
    public Screen getStartScreen() {

        return new GameScreen(this);

    }
}
