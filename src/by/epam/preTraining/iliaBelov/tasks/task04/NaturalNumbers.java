package by.epam.preTraining.iliaBelov.tasks.task04;

public class NaturalNumbers {

    public static final int RANK = 10;

    public static boolean isSimple(int num) {

        boolean b = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b = false;
            }
        }
        return b;
    }

    public static String findSimpleDiv(int num) {

        StringBuilder str = new StringBuilder();

        for (int i = 2; i < num; i++) {
            if (num % i == 0 && isSimple(i)) {
                str.append(i).append(" ");
            }
        }
        return str.toString();
    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) { return a / findGCD(a,b) * b; }

    public static int reverseNum(int num) {

        int countOfDigits = getCountsOfDigits(num);
        int newNum = num % RANK;

        for (int i = 1; i < countOfDigits; i++) {
            int nextDigit = (num /= RANK) % RANK;
            newNum = newNum * RANK + nextDigit;
        }
        return newNum;
    }

    public static int getCountsOfDigits(int num) {

        return (num == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(num) + 0.5));

    }

    public static boolean isPolindrom(int num) {

        return num == reverseNum(num);

    }

    public static int numOfDifDigit(int num) {

        int count = 0;
        int a;

        for (int i = 0; i < RANK; i++) {
            a = num;
            while (a > 0) {
                if (a % RANK == i) {
                    count++;
                    break;
                }
                a /= RANK;
            }
        }
        return count;
    }


    public static int maxDigit(int num) {

        int maxDigit = num % RANK;
        int countOfDigits = getCountsOfDigits(num);

        for (int i = 1; i < countOfDigits; i++) {
            int nextDigit = (num /= RANK) % RANK;
            if (maxDigit < nextDigit) {
                maxDigit = nextDigit;
            }
        }
        return maxDigit;
    }

}
