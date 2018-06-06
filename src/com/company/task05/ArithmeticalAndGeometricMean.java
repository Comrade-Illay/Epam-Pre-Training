package com.company;

public class ArithmeticalAndGeometricMean {

    public static double getArithmetical(int[] arr){

        double sumOfArray = 0;

        for (double anArray : arr) {
            sumOfArray += anArray;
        }
        return sumOfArray / arr.length;
    }

    public static double getGeometricMean(int[] arr) {

        final int INITIAL_MULTIPLICATION_VALUE = 1;
        final int BORDER_FOR_NEGATIVE_NUMBER = 1;

        double multiplyOfArray = INITIAL_MULTIPLICATION_VALUE;

        for (double anArray : arr) {
            if (!(anArray < BORDER_FOR_NEGATIVE_NUMBER)) {
                multiplyOfArray *= anArray;
            } else {
                return -1;
            }
        }

        return Math.pow(multiplyOfArray, 1. / arr.length);
    }
}
