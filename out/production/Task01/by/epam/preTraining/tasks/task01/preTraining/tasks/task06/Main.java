package by.epam.preTraining.tasks.task06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        int n = 4;
        int m = 4;
        MatrixInitializer.checkSizeOfMatrix(n, m);
        double[][] matrix = new double[n][m];
        double leftBorder = 0.0;
        double rightBorder = 8.0;
        MatrixInitializer.initializeMatrix(matrix, leftBorder, rightBorder);
        System.out.println("Matrix:" + n + "x" + m);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Max element of matrix: " + MinAndMax.getMaxElemetOfMatrix(matrix));
        System.out.println("Min element of matrix: " + MinAndMax.getMinElemetOfMatrix(matrix));

        System.out.println("Arithmetical mean: " + ArithmeticalAndGeometricMean.getArithmeticalMean(matrix));
        System.out.println("Geometric mean:" + ArithmeticalAndGeometricMean.getGeometricMean(matrix));

        System.out.println("Local min of matrix: " + Arrays.toString(LocalMinAndMax.findLocalMax(matrix)));
        System.out.println("Local max of matrix: " + Arrays.toString(LocalMinAndMax.findLocalMin(matrix)));

        System.out.println("Transpose rectangular matrix: ");
        if(TransponatedMatrix.checkRectangularity(n, m)){
            double[][] transMatrix = TransponatedMatrix.transponseRectangularMatrix(matrix);
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(transMatrix[i]));
            }
        } else {
            TransponatedMatrix.transponseSquareMatrix(matrix);
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }
    }
}
