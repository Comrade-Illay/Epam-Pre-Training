package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Triangle.arePointsFromTringle(0,0,4,0,4,3));

        System.out.println("Number of heads " + DragonHeads.countingNumberOfHeads(301));
        System.out.println("Number of eyes " + DragonHeads.countingNumbersOfEyes(301));

        System.out.println("It's vowel ? " + Vowel.isVowel1('u'));

        System.out.println("Your mood is " + MoodSensor.scanningSoul());

        System.out.println("\nTest Gregorian Calendar: ");
        System.out.println("With 12.12.2012 (leap year)");
        System.out.println(GregorianCalendar.getDateOfTheNextDay(12, 12, 2012));
        System.out.println("\nWith 30.12.1998 (not a leap year)");
        System.out.println(GregorianCalendar.getDateOfTheNextDay(30, 12, 1998));
    }
}
