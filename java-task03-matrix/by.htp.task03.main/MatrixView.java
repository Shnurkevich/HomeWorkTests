package by.htp.task03.presentation;

public class MatrixView {


    public static void printMatrix(int[][] matrix) {
        System.out.print("Первая строка массива ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.print("\nПоследняя строка массива ");
        for (int i = matrix.length-1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }


}
