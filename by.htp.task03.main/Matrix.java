package by.htp.task03.entity;

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

}
