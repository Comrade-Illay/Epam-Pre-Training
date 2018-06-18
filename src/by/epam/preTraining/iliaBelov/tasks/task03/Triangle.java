package by.epam.preTraining.iliaBelov.tasks.task03;

public class Triangle {
    public static final String NOT_TRIANGLE = "Not Triangle";
    public static final String TRIANGLE = "This is triangle";
    public static final String RECTANGULAR_TRIANGLE = "This triangle is rectangular";
    public static double calcualtionDistanceBetweenPoints(int x1, int y1, int x2, int y2) {

        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

    }

    public static String arePointsFromTringle (int x1, int y1, int x2, int y2, int x3, int y3) {

        String res;
        double firstSide = calcualtionDistanceBetweenPoints(x1, y1, x2, y2);
        double secondSide = calcualtionDistanceBetweenPoints(x1, y1, x3, y3);
        double thirdSide = calcualtionDistanceBetweenPoints(x2, y2, x3, y3);

        if (firstSide + secondSide > thirdSide && thirdSide > Math.abs(firstSide - secondSide)){
            if (firstSide * firstSide + secondSide * secondSide == thirdSide * thirdSide
                    || thirdSide * thirdSide + secondSide * secondSide == firstSide * firstSide
                    || firstSide * firstSide + thirdSide * thirdSide == secondSide * secondSide){
                res = RECTANGULAR_TRIANGLE;
            } else {
                res = TRIANGLE;
            }
        }else {
            res = NOT_TRIANGLE;
        }
        return res;
    }

}
