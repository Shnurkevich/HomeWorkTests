/*
Дан массив действительных чисел. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

package by.htp.task02.main;

import by.htp.task02.entity.ArrEntity;
import by.htp.task02.logic.ArrLogic;
import by.htp.task02.presentation.ArrView;

public class Main {
    public static void main(String[] args) {

        ArrEntity arr = new ArrEntity();
        ArrLogic logic = new ArrLogic();
        ArrView view = new ArrView();

        arr.setArr(new int[] {2, -4, 5, -6, 7, 8, 9, 0, -1, 3});

        String str = view.printResult(logic.counter(arr.getArr()));

        System.out.println(str);

    }
}
