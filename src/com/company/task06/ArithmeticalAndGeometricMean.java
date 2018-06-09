package com.company;

public class ArithmeticalAndGeometricMean {

    public static double getArithmeticalMean(double[][] matrix){
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum/matrix.length;
    }

    public static double getGeometricMean(double[][] matrix){
        double comp = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if(!(matrix[i][j] < 0) ){
                    comp *= matrix[i][j];
                }
            }
        }
        return Math.exp(Math.log(comp) / (matrix.length * matrix[0].length));
    }
}
