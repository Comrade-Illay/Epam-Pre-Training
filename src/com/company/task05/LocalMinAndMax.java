package com.company;

public class LocalMinAndMax {

    public static int getLocalMin(int[] array1){

        for (int i = 1; i < array1.length - 1; i++) {
            if(array1[i] < array1[i + 1] && array1[i] < array1[i - 1]){
                return array1[i];
            }
        }
        return -1;
    }

    public static int getLocalMax(int[] array1){

        for (int i = 1; i < array1.length - 1; i++) {
            if(array1[i] > array1[i + 1] && array1[i] > array1[i - 1]){
                return array1[i];
            }
        }
        return -1;
    }

}
