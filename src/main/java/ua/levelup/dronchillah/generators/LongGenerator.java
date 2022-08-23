package ua.levelup.dronchillah.generators;

import java.util.Random;

public class LongGenerator implements Generator<Long>{
    Random rand = new Random();
    @Override
    public Long getNextRand() {
        return rand.nextLong();
    }
}
