package by.htp.task01.presentation;

import by.htp.task01.entity.Circle;

public class CircleView {

    public String printResult (Circle circle){
       return "Периметр окружности равен " + circle.getPerimeter() + "\n" +
                "Площадь окружности равна " + circle.getSquare();
    }

}

