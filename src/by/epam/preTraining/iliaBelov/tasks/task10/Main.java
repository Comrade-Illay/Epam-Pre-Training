package by.epam.preTraining.iliaBelov.tasks.task10;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of your number: " + SumOfDigits.getSumOfDigit(1234));

        System.out.println("Fibonachi number is " + FibonachiNumber.getFibonachiNumber(10));

        System.out.println("Is summary equals number " + EqualsNumbers.isSumAndNumberEquals(123, 6));

        double x = 12;
        int n = 5;
        System.out.println("Number " + x + " in degree " + n + " is " + Pow.pow(12, 5));

       int numOfRings = 6;
       char first = 'A';
       char second = 'B';
       char temp = 'C';

       HanoiTower.solveHanoiTower(numOfRings, first, second, temp);
    }

}
