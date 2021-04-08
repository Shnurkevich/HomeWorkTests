import by.htp.task02.presentation.ArrView;
import org.junit.Assert;
import org.junit.Test;


public class PresentationTest {
    ArrView view = new ArrView();

    @Test
    public void printResultT01() {
        int[] mas = {1, 2, 3};

        String realOutput = view.printResult(mas);

        String expectedOutput = "Количесто положительных чисел = 1" + "\n" +
                "Количество отрицательных чисел = 2" + "\n" +
                "Количество чисел равных нулю = 3";

        Assert.assertEquals(expectedOutput,realOutput);
    }

}



