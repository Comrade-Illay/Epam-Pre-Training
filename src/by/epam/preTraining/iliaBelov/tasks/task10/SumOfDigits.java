package by.epam.preTraining.iliaBelov.tasks.task10;

public class SumOfDigits {

    public static int getSumOfDigit(int n){

        if(n < 0){
            return 1;
        }
        return n != 0 ? n % 10 + getSumOfDigit(n / 10 ) : 0;
    }
}
