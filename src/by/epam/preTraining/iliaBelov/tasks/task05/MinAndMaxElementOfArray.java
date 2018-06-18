package by.epam.preTraining.tasks.task05;

public class MinAndMaxElementOfArray {

    public static int getMaxElemetOfArray(int[] array){

        int max = array[0];

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinElemetOfArray(int[] array){

        int min = array[0];

        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
