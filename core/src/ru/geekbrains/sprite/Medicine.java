package ru.geekbrains.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.Sprite;
import ru.geekbrains.math.Rect;
import ru.geekbrains.math.Rnd;

public class Medicine extends Sprite {
    private Rect worldBounds;
    private Vector2 v;


    public Medicine (Rect worldBounds, TextureRegion medicineRegion) {
        super(medicineRegion);
        this.worldBounds = worldBounds;


        v = new Vector2(0, -0.4f);
        setHeightProportion(0.08f);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        pos.mulAdd(v, delta);
    }


}
