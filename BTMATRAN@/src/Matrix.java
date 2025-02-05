import java.util.Scanner;

public class Matrix {
    public static int count = 0;
    int n;
    int m;
    int[][] maTrix;

    public Matrix(int n, int m) {
        count++;
        this.n = n;
        this.m = m;
        maTrix = new int[n][m];
    }

    public void printMatrix() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Nhap ma tran " + count);
        for (int i = 0; i < maTrix.length; i++) {
            for (int j = 0; j < maTrix[0].length; j++) {
                maTrix[i][j] = cs.nextInt();
            }
        }
    }

    public int[][] getMaTrix() {
        return maTrix;
    }

    public void outMatrix(int[][] a) {
        System.out.println("Xuat ma tran");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

   

}
