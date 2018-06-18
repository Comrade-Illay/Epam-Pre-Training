package by.epam.preTraining.tasks.task02;

public class ReverseNumbers {
    public static int reverseNum(int a) {
        byte n1 = (byte) ((a / 1000000) % 10);
        byte n2 = (byte) ((a / 100000) % 10);
        byte n3 = (byte) ((a / 10000) % 10);
        byte n4 = (byte) ((a / 1000) % 10);
        byte n5 = (byte) ((a / 100) % 10);
        byte n6 = (byte) ((a / 10) % 10);
        byte n7 = (byte) (a % 10);

        int num = 0;

        num += n1;
        num += n2 * 10;
        num += n3 * 100;
        num += n4 * 1000;
        num += n5 * 10000;
        num += n6 * 100000;
        num += n7 * 1000000;

        return num;
    }

}
