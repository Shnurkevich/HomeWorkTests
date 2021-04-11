package by.htp.task01.logic;

public class CircleLogic {

    //Вычисление площади окружности
    public double squareCount (double rad){
        double square = Math.PI * (rad * rad);
        return square;
    }


    //Вычисление длины окружности
    public double circuitCount (double rad){
        double circuit = 2 * Math.PI * rad;
        return circuit;
    }

}
