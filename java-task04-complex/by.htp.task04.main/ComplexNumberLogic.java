package by.htp.task04;

public class ComplexNumberLogic {

    public ComplexNumber sum(ComplexNumber number1, ComplexNumber number2) {

        ComplexNumber number = new ComplexNumber();
        number.setReal(number1.getReal() + number2.getReal());
        number.setImaginary(number1.getImaginary() + number2.getImaginary());

        return number;
    }

    public ComplexNumber cut(ComplexNumber number1, ComplexNumber number2) {

        ComplexNumber number = new ComplexNumber();
        number.setReal(number1.getReal() - number2.getReal());
        number.setImaginary(number1.getImaginary() - number2.getImaginary());

        return number;
    }
}
