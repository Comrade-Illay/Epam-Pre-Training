package by.epam.preTraining.iliaBelov.tasks.task10;

public class FibonachiNumber {

    public static int getFibonachiNumber(int n){
        if(n < 2){
            if(n < 0){
                return -1;
            }
            return n;
        }
        return getFibonachiNumber(n -1) + getFibonachiNumber(n - 2);
    }
}
