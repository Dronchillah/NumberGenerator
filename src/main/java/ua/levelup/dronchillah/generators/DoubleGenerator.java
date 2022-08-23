package ua.levelup.dronchillah.generators;

import java.util.Random;

public class DoubleGenerator implements Generator<Double>{
    Random rand = new Random();
    @Override
    public Double getNextRand() {
        return rand.nextDouble();
    }
}
