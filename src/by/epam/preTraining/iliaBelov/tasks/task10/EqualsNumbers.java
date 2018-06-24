package by.epam.preTraining.iliaBelov.tasks.task10;

public class EqualsNumbers {

    public static boolean isSumAndNumberEquals(int n, int m){
        if (n == 0) {
            if (m == 0) {
                return true;
            }
            return false;
        }
        return isSumAndNumberEquals(n / 10, m - (n % 10));
    }

}

