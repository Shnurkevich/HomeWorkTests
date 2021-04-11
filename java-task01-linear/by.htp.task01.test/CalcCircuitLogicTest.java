

import by.htp.task01.entity.Circle;
import by.htp.task01.logic.CircleLogic;
import org.junit.Assert;
import org.junit.Test;

public class CalcCircuitLogicTest {
    @Test
    public void calcCircuitT01() {

        Circle circle = new Circle(3.0);
        CircleLogic circleLogic = new CircleLogic();

        double realCircuit;
        double expectedCircuit = 18.8495559;

        realCircuit = circleLogic.circuitCount(circle.getRadius());
        Assert.assertEquals(expectedCircuit, realCircuit, 0.000001);

    }

    @Test
    public void calcCircuitT02() {

        Circle circle = new Circle(0.0);
        CircleLogic circleLogic = new CircleLogic();

        double realCircuit;
        double expectedCircuit = 0.0;

        realCircuit = circleLogic.circuitCount(circle.getRadius());
        Assert.assertEquals(expectedCircuit, realCircuit, 0.000001);

    }


}
