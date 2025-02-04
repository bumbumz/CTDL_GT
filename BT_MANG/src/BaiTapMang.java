import java.util.Random;
import java.util.Scanner;

public class BaiTapMang {
    float a[];

    int n;

    public BaiTapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mãng:");
        n = sc.nextInt();

        a = createMangSoThuc(n);
        System.out.println("Số lượng phần tử bằng: " + a.length);

    }
    // phương thức trả về mảng số thực

    public float[] createMangSoThuc(int n) {
        float[] temp = new float[n];
        for (int i = 0; i < n; i++) {
            temp[i] = new Random().nextFloat(101) - 50;
        }
        return temp;

    }

    public void outMangSoThuc() {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Phan tu thu" + i + " la: " + a[i]);
        }
    }

    public float sum2FirstElement() {
        float sum = 0;
        for (int i = 0; i <= 1 && i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public void addCuoi(float x) {
        n = n + 1;
        float[] temp = new float[n];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        temp[n - 1] = x;
        a = temp;
    }

    public float printMin() {
        float min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public float ranDomPhanTu() {
        int n = new Random().nextInt(a.length);
        return a[n];
    }

    public static void main(String[] args) {
        BaiTapMang bt = new BaiTapMang();
        bt.addCuoi(-10);
        bt.outMangSoThuc();
        System.out.println("Tổng hai phần tử đầu mảng: " + bt.sum2FirstElement());
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + bt.printMin());
        System.out.println("Phần tử ngẫu nhiên :" + bt.ranDomPhanTu());
    }
}
