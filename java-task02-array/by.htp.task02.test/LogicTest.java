import by.htp.task02.logic.ArrLogic;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LogicTest {
    ArrLogic logic = new ArrLogic();


    @Test
    public void countT01() {
        int[] mas = {1, 2, 3, -1, -2, 0};
        int[] realMas;
        int[] expectedMas = new int[]{3, 2, 1};

        realMas = logic.counter(mas);
        assertTrue("Ошибка, массивы не равны", java.util.Arrays.equals(realMas, expectedMas));
    }


    @Test
    public void countT02() {
        int[] mas = {1, 2, 3};

        int expectedMasLength = 3;
        int realMasLength;

        int[] realMas =  logic.counter(mas);
        realMasLength = realMas.length;

        Assert.assertEquals(expectedMasLength, realMasLength);
    }
}
