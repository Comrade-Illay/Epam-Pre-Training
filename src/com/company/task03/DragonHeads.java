package com.company;

public class DragonHeads {
    public static final int BORDER_OF_CHILDHOOD = 200;
    public static final int BORDER_OF_YOUTH = 300;

    public static final int INCREASE_HEADS_IN_CHILD = 3;
    public static final int INCREASE_HEADS_IN_YOUTH = 2;
    public static final int INCREASE_HEADS_IN_OLD = 1;

    public static final int NUMBER_OF_EYES = 2;

    public static int countingNumberOfHeads(int age) {
        int heads = INCREASE_HEADS_IN_CHILD;
        if (age <= BORDER_OF_CHILDHOOD) {
            heads += INCREASE_HEADS_IN_CHILD * age;
        } else if (age <= BORDER_OF_YOUTH) {
            heads += (BORDER_OF_CHILDHOOD * INCREASE_HEADS_IN_CHILD +
                    (age -BORDER_OF_CHILDHOOD) * INCREASE_HEADS_IN_YOUTH);
        } else
            heads += BORDER_OF_CHILDHOOD * INCREASE_HEADS_IN_CHILD +
                    (BORDER_OF_YOUTH - BORDER_OF_CHILDHOOD) * INCREASE_HEADS_IN_YOUTH +
                    (age - BORDER_OF_YOUTH) * INCREASE_HEADS_IN_OLD;

        return heads;
    }


    public static int countingNumbersOfEyes(int age) {

        return countingNumberOfHeads(age)* NUMBER_OF_EYES;
    }
}
