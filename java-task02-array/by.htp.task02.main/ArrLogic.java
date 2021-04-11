package by.htp.task02.logic;

public class ArrLogic {

    private int positive = 0;
    private int negative = 0;
    private int zero = 0;



    public int[] counter (int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                positive++;
            }
            else if (arr[i] < 0){
                negative++;
            }
            else {
                zero++;
            }
        }
        return new int[]{positive, negative, zero};
    }

}
