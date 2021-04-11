package by.htp.task01.entity;

import java.util.Objects;

public class Circle {
    private double square;
    private double perimeter;
    private double radius;


    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.square, square) == 0 && Double.compare(circle.perimeter, perimeter) == 0 && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, perimeter, radius);
    }


}
