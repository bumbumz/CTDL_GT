import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap  so dong ma tran:");
        a = sc.nextInt();
        System.out.println("Nhap  so cot ma tran:");
        b = sc.nextInt();
        Matrix maTrix1 = new Matrix(a, b);
        maTrix1.printMatrix();
        maTrix1.outMatrix(maTrix1.maTrix);

        System.out.println("Nhap  so dong ma tran:");
        a = sc.nextInt();
        System.out.println("Nhap  so cot ma tran:");
        b = sc.nextInt();
        Matrix maTrix2 = new Matrix(a, b);
        maTrix2.printMatrix();
        maTrix2.outMatrix(maTrix2.maTrix);

        MathMatrix mathMatrix = new MathMatrix();

        int n;
        do {

            System.out.println("Nhap lua chon:");
            System.out.println("Cong hai ma tran");
            System.out.println("Nhan hai ma tran");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("ma tran sau khi cong vs nhau la");
                    maTrix1.outMatrix(mathMatrix.sum2Matrix(maTrix1.maTrix, maTrix2.maTrix));

                    break;
                case 2:
                    System.out.println("ma tran sau khi nhan vs nhau la");
                    maTrix1.outMatrix(mathMatrix.multiplyMatrix(maTrix1.maTrix, maTrix2.maTrix));
                    break;
                default:
                    break;
            }

        } while (n != 0);

    }
}
