package ru.geekbrains.pool;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.base.SpritesPool;
import ru.geekbrains.math.Rect;
import ru.geekbrains.sprite.Medicine;

public class MedicinePool extends SpritesPool <Medicine> {
    private Rect worldBounds;
    private TextureRegion medicineRegion;

    public MedicinePool (Rect worldBounds, TextureRegion medicineRegion) {
        this.worldBounds = worldBounds;
        this.medicineRegion = medicineRegion;
    }

    @Override
    protected Medicine newObject() {
        return new Medicine(worldBounds, medicineRegion);
    }
}
