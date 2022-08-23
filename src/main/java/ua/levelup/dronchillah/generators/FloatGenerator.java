package ua.levelup.dronchillah.generators;

import java.util.Random;

public class FloatGenerator implements Generator<Float>{
    Random rand = new Random();
    @Override
    public Float getNextRand() {
        return rand.nextFloat();
    }
}
