package by.htp.task04;

public class Main {

    public static void main(String[] args) {

        ComplexNumber number1 = new ComplexNumber(2, 5);
        ComplexNumber number2 = new ComplexNumber(6, 3);
        ComplexNumber number3;
        ComplexNumber number4;

        ComplexNumberLogic logic = new ComplexNumberLogic();

        number3 = logic.cut(number1, number2);
        number4 = logic.sum(number1, number2);

        System.out.println(number3);
        System.out.println(number4);



    }
}
