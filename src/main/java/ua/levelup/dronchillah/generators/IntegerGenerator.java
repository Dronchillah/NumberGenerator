package ua.levelup.dronchillah.generators;

import java.util.Random;

public class IntegerGenerator implements Generator<Integer>{
    Random rand = new Random();
    @Override
    public Integer getNextRand() {
        return rand.nextInt();
    }
}
