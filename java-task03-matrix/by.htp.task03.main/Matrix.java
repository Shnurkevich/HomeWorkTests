package by.htp.task03.entity;

import java.util.Arrays;
import java.util.Objects;

public class Matrix{

    private int columns;
    private int lines;
    private int[][] matrix;


    public Matrix(){
    }

    public Matrix(int lines, int columns) {
        this.columns = columns;
        this.lines = lines;
        this.matrix = new int[lines][columns];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;
        Matrix matrix1 = (Matrix) o;
        return columns == matrix1.columns && lines == matrix1.lines && Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(columns, lines);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }
}
