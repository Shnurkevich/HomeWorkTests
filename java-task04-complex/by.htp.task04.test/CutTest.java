package by.htp.task04.test;

import by.htp.task04.ComplexNumber;
import by.htp.task04.ComplexNumberLogic;
import org.junit.Assert;
import org.junit.Test;

public class CutTest {

    @Test
    public void cutT001() {

        ComplexNumber cn1 = new ComplexNumber(-1, -1);
        ComplexNumber cn2 = new ComplexNumber(-2, -2);
        ComplexNumber realComplexNumber;

        ComplexNumber expectedComplexNumber = new ComplexNumber(1, 1);

        ComplexNumberLogic logic = new ComplexNumberLogic();
        realComplexNumber = logic.cut(cn1, cn2);

        Assert.assertEquals(expectedComplexNumber, realComplexNumber);

    }
}
