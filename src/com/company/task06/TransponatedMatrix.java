package com.company;

public class TransponatedMatrix {

    public static void transponseSquareMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                double tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static double[][] transponseRectangularMatrix(double[][] matrix) {

        double [][] transMatrix = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                transMatrix[i][j] = matrix[j][i];
            }
        }
        return transMatrix;
    }

    public static boolean checkRectangularity (int n, int m){
        return !(n == m);
    }
}
