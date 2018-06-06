package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Maximum elements of array: " + MinAndMaxElementOfArray.getMaxElemetOfArray(arr));
        System.out.println("Minimum elements of array: " + MinAndMaxElementOfArray.getMinElemetOfArray(arr));

        System.out.println("Arithmetical mean of array: " + ArithmeticalAndGeometricMean.getArithmetical(arr));
        System.out.println("Arithmetical mean of array: " + ArithmeticalAndGeometricMean.getGeometricMean(arr));

        int[] array = {23, 15, 14, 8, 2};
        System.out.println("The elements of this array are arranged in descending order:"
                + IncreasingAndDecreasingArray.isArrDecreasing(array));

        System.out.println("The elements of this array are arranged in ascending order:"
                + IncreasingAndDecreasingArray.isArrIncreasing(array));

        int[] array1 = {5, 6, 4, 3, 2, 43, 5, 32};
        System.out.println("Local minimum of array:" + LocalMinAndMax.getLocalMin(array1));
        System.out.println("Local maximum of array:" + LocalMinAndMax.getLocalMax(array1));

        System.out.println("Reversing elements of array: ");
        ReverseArray.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
