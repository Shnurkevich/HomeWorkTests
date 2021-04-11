package by.htp.task03.test;

import by.htp.task03.logic.MatrixLogic;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LogicTest {

    @Test
    public void createMatrixT01() {
        MatrixLogic logic = new MatrixLogic();
        int[][] mas = new int[2][3];
        int[][] realMas;
        int[][] expectedMas = new int[][]{{0, 1, 2}, {3, 4, 5}};

        realMas = logic.createMatrix(mas);
        assertArrayEquals("Ошибка, массивы не равны", realMas, expectedMas);
    }
}
