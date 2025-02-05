import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dictionany<String, String> d1 = new Dictionany<String, String>("hello", "Xin chao");
        System.out.println(d1.toString());

        Dictionany<String, String>[] tudien = new Dictionany[3];
        Scanner sc = new Scanner(System.in);
        String key;
        String value;
        for (int i = 0; i < tudien.length; i++) {
            System.out.println("Nhap key:");
            key = sc.nextLine();
            System.out.println("Nhap value:");
            value = sc.nextLine();
            tudien[i] = new Dictionany<String, String>(key, value);
        }
        

        for (Dictionany<String, String> dictionany : tudien) {
            System.out.println(dictionany.toString());
        }

    }
}
