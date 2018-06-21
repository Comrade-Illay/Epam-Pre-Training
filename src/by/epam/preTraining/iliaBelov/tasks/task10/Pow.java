package by.epam.preTraining.iliaBelov.tasks.task10;

public class Pow {

    public static double pow(double x, int n){
        if(n == 0 ){
            return 1;
        }
        return x * pow(x, n -1);
    }

}
