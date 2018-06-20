package by.epam.preTraining.tasks.task05;

public class ReverseArray {

    public static void reverseArray(int[] array){

        int halfOfArray = array.length / 2;

        for (int i = 0; i < halfOfArray; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = tmp;
        }
    }

}
