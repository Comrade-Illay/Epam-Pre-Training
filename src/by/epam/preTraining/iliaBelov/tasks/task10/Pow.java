package by.epam.preTraining.iliaBelov.tasks.task10;

public class Pow {

    public static double pow(int x, int n){
        if(x == 0 || n < 0){
            return 1;
        }
        return  n != 0 ? x * pow(x, n - 1) : 1;
    }
}
