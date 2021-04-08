/*
Задача №16 из Java Fundamentals
Вычислить длину окружности и площадь круга одного и того же заданного радиуса
 */

package by.htp.task01.start;

import by.htp.task01.entity.Circle;
import by.htp.task01.logic.CircleLogic;
import by.htp.task01.presentation.CircleView;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(4.20);
        CircleLogic logic = new CircleLogic();
        CircleView view = new CircleView();

        String output;
        double perimeter;
        double square;

        perimeter = logic.circuitCount(circle.getRadius());
        square = logic.squareCount(circle.getRadius());

        circle.setPerimeter(perimeter);
        circle.setSquare(square);

        output = view.printResult(circle);

        System.out.println(output);

    }

}
