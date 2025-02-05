import java.util.Random;

public class Matrix {
    int n;
    int[][] maTrixA, maTrixB;

    public Matrix(int n) {
        this.n = n;
        maTrixA = new int[n][n];
        maTrixB = new int[n][n];
        creatMaTrix();
    }

    public void creatMaTrix() {
        Random randomA = new Random();
        Random randomB = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maTrixA[i][j] = randomA.nextInt(10);
                maTrixB[i][j] = randomB.nextInt(10);
            }
        }
    }

    public void printMatrix(int[][] matrix) {
        System.out.println("Matrix---------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }

    public void printMatrixA() {
        printMatrix(maTrixA);
    }

    public void printMatrixB() {
        printMatrix(maTrixB);
    }

    public void sumMaTran() {
        int[][] sumMt = new int[this.maTrixA.length][maTrixA[0].length];

        for (int i = 0; i < maTrixA.length; i++) {
            for (int j = 0; j < maTrixA.length; j++) {
                sumMt[i][j] = maTrixA[i][j] + maTrixB[i][j];
            }
        }

        printMatrix(sumMt);
    }

    public void tichMaTran() {
        int[][] tempMt = new int[this.maTrixA.length][maTrixA[0].length];

        for (int i = 0; i < maTrixA.length; i++) {
            for (int j = 0; j < maTrixA.length; j++) {
                for (int k = 0; k < maTrixA.length; k++) {
                    tempMt[i][j] += maTrixA[i][k] * maTrixB[k][j];
                }
            }
        }
        printMatrix(tempMt);
    }

}
