package Lab1;

public class Matrices {
    public static void main(String[] args) {

        // khoi tao cac ma tran
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 10, 11},
                {12, 13, 14},
                {15, 16, 17}
        };

        // Function to check matrices's size
        if (areSameSize(matrix1, matrix2)) {
            // cong 2 ma tran
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // hien thi ket qua
            System.out.println("Ma tran 1: ");
            printMatrix(matrix1);

            System.out.println("\nMa tran 2: ");
            printMatrix(matrix2);

            System.out.println("\nKet qua: ");
            printMatrix(resultMatrix);
        } else {
            System.out.println("Khong the cong!");
        }
    }

    // Function to check if matrices have same size
    private static boolean areSameSize(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    // Function to add 2 matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to print the matrix added by 2 matrices
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
