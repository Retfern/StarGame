package ru.geekbrains.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


import ru.geekbrains.base.ScaledTouchUpButton;
import ru.geekbrains.screen.GameScreen;


public class ButtonNewGame extends ScaledTouchUpButton {
    private GameScreen gameScreen;
    public ButtonNewGame(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
        this.gameScreen = gameScreen;
        setHeightProportion(0.05f);
        setTop(-0.1f);
    }

    @Override
    protected void action() {
        gameScreen.reset();
    }
}
