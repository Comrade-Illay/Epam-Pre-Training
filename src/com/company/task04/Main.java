package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Number of heads and tails: " + HeadsOrTails.tossTheCoin(1000));

        System.out.println("Yours number is perfect: " + PerfectNumber.isPerfect(28));

        System.out.println("Yours number is simple: " + NaturalNumbers.isSimple(5));
        System.out.println("Simple dividers of your number: "+ NaturalNumbers.findSimpleDiv(20));
        System.out.println("Greatest common divisor  of two numbers " + NaturalNumbers.findGCD(25,15));
        System.out.println("Least common multiple of two numbers " + NaturalNumbers.findLCM(3,4));
        System.out.println("Yours number is polindrom: " + NaturalNumbers.isPolindrom(1230321));
        System.out.println("Numbers of different digit in number: " + NaturalNumbers.numOfDifDigit(55555));
        System.out.println("Biggest digit in number: " +NaturalNumbers.maxDigit(12345));

    }
}
