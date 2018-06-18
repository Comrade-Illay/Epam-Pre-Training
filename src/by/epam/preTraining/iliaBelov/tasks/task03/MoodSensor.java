package by.epam.preTraining.iliaBelov.tasks.task03;

import java.util.Random;

public class MoodSensor {

    public static final String SMILE = ":)";
    public static final String SAD = ":(";
    public static final String WINK = ";)";
    public static final String FUNNY = ":D";
    public static final String NO_EMOTIONS = ":|";
    public static final String CRYING = ":'(";
    public static final String TONGUE = ":P";
    public static final String SURPRISED = "0_0";
    public static final String CUTE = "^_^";
    public static final String ANGRY = ">:|";

    public static final int NUMBER_FOR_SMILE = 0;
    public static final int NUMBER_FOR_SAD = 1;
    public static final int NUMBER_FOR_WINK = 2;
    public static final int NUMBER_FOR_FUNNY = 3;
    public static final int NUMBER_FOR_NO_EMOTIONS = 4;
    public static final int NUMBER_FOR_CRYING = 5;
    public static final int NUMBER_FOR_TONGUE = 6;
    public static final int NUMBER_FOR_SURPRISED = 7;
    public static final int NUMBER_FOR_CUTE = 8;
    public static final int NUMBER_FOR_ANGRY = 9;


    public static String scanningSoul() {

        String mood = null;
        int randomNum = new Random().nextInt(10);

        if  (randomNum == NUMBER_FOR_SMILE) {
            mood = SMILE;
        } else if (randomNum == NUMBER_FOR_SAD) {
            mood = SAD;
        }else if (randomNum == NUMBER_FOR_WINK) {
            mood = WINK;
        } else if (randomNum == NUMBER_FOR_FUNNY) {
            mood = FUNNY;
        }else if (randomNum == NUMBER_FOR_NO_EMOTIONS) {
            mood = NO_EMOTIONS;
        }else if (randomNum == NUMBER_FOR_CRYING) {
            mood = CRYING;
        }else if (randomNum == NUMBER_FOR_TONGUE) {
            mood = TONGUE;
        }else if (randomNum == NUMBER_FOR_SURPRISED) {
            mood = SURPRISED;
        }else if (randomNum == NUMBER_FOR_CUTE) {
            mood = CUTE;
        }else if (randomNum == NUMBER_FOR_ANGRY) {
            mood = ANGRY;
        }
        return mood;
    }
}
