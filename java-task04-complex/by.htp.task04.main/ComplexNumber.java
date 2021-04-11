package by.htp.task04;

import java.util.Objects;

public class ComplexNumber {

    private int real;
    private int imaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "ComplexNumber [real= " + real + "]  [imaginary= " + imaginary + "i]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber number = (ComplexNumber) o;
        return real == number.real && imaginary == number.imaginary;
    }

}
