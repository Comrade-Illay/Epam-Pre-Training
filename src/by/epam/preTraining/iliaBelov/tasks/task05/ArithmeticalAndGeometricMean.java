package by.epam.preTraining.tasks.task05;

public class ArithmeticalAndGeometricMean {

    public static double getArithmetical(int[] array){

        double sumOfArray = 0;

        for (double anArray : array) {
            sumOfArray += anArray;
        }
        return sumOfArray / array.length;
    }

    public static double getGeometricMean(int[] array) {

        final int INITIAL_MULTIPLICATION_VALUE = 1;
        final int BORDER_FOR_NEGATIVE_NUMBER = 1;

        double multiplyOfArray = INITIAL_MULTIPLICATION_VALUE;

        for (double anArray : array) {
            if (!(anArray < BORDER_FOR_NEGATIVE_NUMBER)) {
                multiplyOfArray *= anArray;
            } else {
                return -1;
            }
        }

        return Math.pow(multiplyOfArray, 1. / array.length);
    }
}
