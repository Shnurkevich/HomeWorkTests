//Дана матрица. Вывести на экран первую и последнюю строки

package by.htp.task03.start;

import by.htp.task03.entity.Matrix;
import by.htp.task03.logic.MatrixLogic;
import by.htp.task03.presentation.MatrixView;

public class Main {
    public static void main(String[] args) {

        MatrixLogic logic = new MatrixLogic();
        MatrixView view = new MatrixView();
        Matrix matrix = new Matrix(4, 6);        //Задаем размер матрицы с помощью конструктора

        logic.createMatrix(matrix.getMatrix());             //Заполняем матрицу числами

        view.printMatrix(matrix.getMatrix());              //Выводим на экран первую и последнюю строки

    }
}
