package by.epam.preTraining.tasks.task05;

public class ReverseArray {

    public static void reverseArray(int[] array){

        for (int i = 0; i <array.length/2 ; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = tmp;
        }
    }

}
