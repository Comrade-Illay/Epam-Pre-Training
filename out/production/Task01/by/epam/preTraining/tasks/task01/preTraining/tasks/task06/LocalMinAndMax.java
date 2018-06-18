package by.epam.preTraining.tasks.task06;

public class LocalMinAndMax {

    public static double[] findLocalMin(double[][] matrix) {

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j]
                        && matrix[i][j] < matrix[i][j + 1]) {
                    return new double[]{i, j};
                }
            }
        }

        return new double[]{-1, -1};
    }

    public static double[] findLocalMax(double[][] matrix) {

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i][j + 1]
                        && matrix[i][j] > matrix[i + 1][j]
                        && matrix[i][j] > matrix[i][j + 1]) {
                    return new double[]{i, j};
                }
            }
        }

        return new double[]{-1, -1};
    }
}
