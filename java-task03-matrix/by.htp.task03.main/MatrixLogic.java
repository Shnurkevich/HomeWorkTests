package by.htp.task03.logic;

public class MatrixLogic {

    public int[][] createMatrix (int[][] matrix){
        int iter = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = iter;
                iter++;
            }
        }
        return matrix;
    }
}
