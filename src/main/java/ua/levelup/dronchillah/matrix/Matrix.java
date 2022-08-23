package ua.levelup.dronchillah.matrix;

import ua.levelup.dronchillah.generators.Generator;

import java.lang.reflect.Array;

public class Matrix<T extends Number> {

T[][] matrix;

    public Matrix(Class<T> item, int rows, int columns){
        matrix = (T[][]) Array.newInstance(item, 3, 3);
    }

    public void fillMatrix(Generator<T> generator){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generator.getNextRand();
            }
        }
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
