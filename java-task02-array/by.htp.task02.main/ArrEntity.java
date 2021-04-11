package by.htp.task02.entity;

import java.util.Arrays;

public class ArrEntity {

    private int arr[];


    public ArrEntity() {
    }


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrEntity)) return false;
        ArrEntity arrEntity = (ArrEntity) o;
        return Arrays.equals(arr, arrEntity.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}


