package by.epam.preTraining.tasks.task05;

public class LocalMinAndMax {

    public static int getLocalMin(int[] array){

        for (int i = 1; i < array.length - 1; i++) {
            if(array[i] < array[i + 1] && array[i] < array[i - 1]){
                return array[i];
            }
        }
        return -1;
    }

    public static int getLocalMax(int[] array){

        for (int i = 1; i < array.length - 1; i++) {
            if(array[i] > array[i + 1] && array[i] > array[i - 1]){
                return array[i];
            }
        }
        return -1;
    }

}
