package by.epam.preTraining.tasks.task05;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int size  = 5;
        int[] array = new int[size];
        ArrayInitializer.initArray(array, -20, 20);
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Maximum elements of array: " + MinAndMaxElementOfArray.getMaxElemetOfArray(array));
        System.out.println("Minimum elements of array: " + MinAndMaxElementOfArray.getMinElemetOfArray(array));

        System.out.println("Arithmetical mean of array: " + ArithmeticalAndGeometricMean.getArithmetical(array));
        System.out.println("Arithmetical mean of array: " + ArithmeticalAndGeometricMean.getGeometricMean(array));


        System.out.println("The elements of this array are arranged in descending order:"
                + IncreasingAndDecreasingArray.isArrDecreasing(array));

        System.out.println("The elements of this array are arranged in ascending order:"
                + IncreasingAndDecreasingArray.isArrIncreasing(array));


        System.out.println("Local minimum of array:" + LocalMinAndMax.getLocalMin(array));
        System.out.println("Local maximum of array:" + LocalMinAndMax.getLocalMax(array));


        System.out.println("Reversing elements of array: ");
        ReverseArray.reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}
