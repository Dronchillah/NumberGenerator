package ua.levelup.dronchillah.main;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import ua.levelup.dronchillah.generators.Generator;
import ua.levelup.dronchillah.matrix.Matrix;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GeneratorFactory {
    static Random rand = new Random();
    static List<Generator<?>> list = new ArrayList<>();
public static Generator<? extends Number> getGenerator() {
    Reflections reflections = new Reflections("ua.levelup.dronchillah.generators", Scanners.SubTypes);
    Set<Class<? extends Generator>> set = reflections.getSubTypesOf(Generator.class);
    Class<? extends Generator>[] arr = set.toArray(new Class[0]);
    for(Class<? extends Generator> x : arr){
        try {
            list.add(x.getDeclaredConstructor().newInstance());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    return list.get(rand.nextInt(list.size()));
}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getGenerator().getNextRand());
        }
    }
}
