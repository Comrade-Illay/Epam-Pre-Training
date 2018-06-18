package by.epam.preTraining.tasks.task05;

public class IncreasingAndDecreasingArray {

    public static boolean isArrIncreasing(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
           if (array[i] > array[i+1]){
               return false;
           }
        }
        return true;
    }

    public static boolean isArrDecreasing(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]){
                return false;
            }
        }
        return true;
    }

}
