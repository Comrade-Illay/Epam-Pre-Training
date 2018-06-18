package by.epam.preTraining.tasks.task06;

import java.util.Random;

public class MatrixInitializer {

    public static void initializeMatrix(double[][] matrix, double leftBorder, double rightBorder){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextDouble()*(rightBorder - leftBorder) + leftBorder;
            }
        }
    }

    public static void checkSizeOfMatrix(int n, int m) throws Exception {
        if (n == 0 || m == 0){
            throw new Exception("The attempt to initialize array with wrong sizes");
        }
    }

}
