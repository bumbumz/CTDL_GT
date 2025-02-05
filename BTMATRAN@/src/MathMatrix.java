public class MathMatrix {
    public int[][] sum2Matrix(int[][] a, int[][] b) throws AppException {
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Hai ma trận không bằng nhau về so dong va so cotcot");
            throw new AppException("lỗi ");
        } else {
            int[][] temp = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    temp[i][j] = a[i][j] + b[i][j];
                }
            }
            return temp;
        }

    }

    public int[][] multiplyMatrix(int[][] a, int[][] b) throws AppException {
        if (a[0].length != b.length) {
            throw new AppException("Nhan hai ma tran thì số cột của ma trận 1 phải bằng số hàng của ma trận 2");
        }

        int[][] temp = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    temp[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return temp;
    }
}
