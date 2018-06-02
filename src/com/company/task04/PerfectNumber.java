package com.company;

public class PerfectNumber {

    public static boolean isPerfect(int num){

        int sum = 1;
        boolean b = false;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                b = true;
            }
        return b;
    }
}
