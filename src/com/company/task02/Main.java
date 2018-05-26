package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        System.out.println(" Checking equality of 3 variables ");
        boolean bool = Equals.chekingEqualty(a, b, c);
        System.out.println("is " + a + " = " + b + " = " + c + "  " + bool);
        b = 55;
        bool = Equals.chekingEqualty(a, b, c);
        System.out.println("is " + a + " = " + b + " = " + c + "  " + bool);

        System.out.println("\n Calculating kilograms in milligrams, grams and tons ");
        c = DinoMass.dinoMassInMilligrams(b);
        System.out.println(b + " kilograms to " + c + " milligrams");

        c = DinoMass.dinoMassInGrams(b);
        System.out.println(b + " kilograms to " + c + " grams");

        double d = DinoMass.dinoMassInTons(b);
        System.out.println(b + " kilograms to " + d + " tons");

        System.out.println("\n Calculating ring area ");
        d = RingSquare.ringArea(b, a);
        System.out.println("Ring area with r1 = " + b + " and r2 = " + a + " --> " + d);

        System.out.println("\n Is number increasing or decreasing sequence ");
        a = 2469;
        bool = Sequence.increasingSequence(a);
        System.out.println("is " + a + " increasing sequence " + bool);

        a = 9531;
        bool = Sequence.decreasingSequence(a);
        System.out.println("is " + a + " decreasing sequence  " + bool);

        System.out.println("\n Arithmetic and geometric means ");
        a = 354867;
        System.out.println("a = " + a);

        d = Avarage.arithmeticMean(a);
        System.out.println("arithmetic mean of " + a + " = " + d);

        d = Avarage.geometricMean(a);
        System.out.println("geometric mean of " + a + " = " + d);

        System.out.println("\n Reversing Numbers ");
        a = a + 1000000;
        System.out.println("a = " + a);

        c = ReverseNumbers.reverseNum(a);
        System.out.println("Reversed " + a + " = " + c);

        System.out.println("\n Changing values of 2 variables ");
        ValueChange.change(a, b);
    }
}
