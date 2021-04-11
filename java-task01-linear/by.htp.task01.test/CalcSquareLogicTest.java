import by.htp.task01.entity.Circle;
import by.htp.task01.logic.CircleLogic;
import org.junit.Assert;
import org.junit.Test;


public class CalcSquareLogicTest {

    @Test
    public void calcSquareT01() {

        Circle circle = new Circle(2.0);
        CircleLogic circleLogic = new CircleLogic();

        double realSquare;
        double expectedSquare = 12.56637;

        realSquare = circleLogic.squareCount(circle.getRadius());
        Assert.assertEquals(expectedSquare, realSquare, 0.000001);

    }

    @Test
    public void calcSquareT02() {

        Circle circle = new Circle(0.0);
        CircleLogic circleLogic = new CircleLogic();

        double realSquare;
        double expectedSquare = 0.0;

        realSquare = circleLogic.squareCount(circle.getRadius());
        Assert.assertEquals(expectedSquare, realSquare, 0.000001);

    }

}
