package by.epam.preTraining.iliaBelov.tasks.task04;

public class DinoMass {
    public static final int Milligrams = 1000000;
    public static final int Grams = 1000;
    public static final double Tons = 0.001;

    public static int dinoMassInMilligrams(int kilograms) {
        return kilograms * Milligrams;
    }

    public static int dinoMassInGrams(int kilograms) {
        return kilograms * Grams;
    }

    public static double dinoMassInTons(int kilograms) {
        return kilograms * Tons;
    }
}