package by.epam.preTraining.iliaBelov.tasks.task10;

public class EqualsNumbers {

    public static boolean isSumandNumberEquals(int n, int m){
        if (n == 0) {
            if (m == 0) {
                return true;
            }
            return false;
        }
        return isSumandNumberEquals(n / 10, m - (n % 10));
    }

}

