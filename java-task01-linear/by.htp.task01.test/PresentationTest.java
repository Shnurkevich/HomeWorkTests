import by.htp.task01.entity.Circle;
import by.htp.task01.presentation.CircleView;
import org.junit.Assert;
import org.junit.Test;

public class PresentationTest {


    @Test
    public void printResultT01() {
        CircleView view = new CircleView();
        Circle circle = new Circle();
        circle.setPerimeter(3.0);
        circle.setSquare(2.0);

        String realOutput = view.printResult(circle);

        String expectedOutput = "Периметр окружности равен 3.0" + "\n" +
                "Площадь окружности равна 2.0";

        Assert.assertEquals(expectedOutput,realOutput);
    }

}