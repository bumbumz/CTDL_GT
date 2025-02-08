import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<SinhVien> ll = new LinkedList<>();
        SinhVien sv1 = new SinhVien("2122110161", "Pham Cong Vinh", 18, 8.24);
        SinhVien sv2 = new SinhVien("2122110162", "Tran Xuan Hoang", 18, 8.24);
        SinhVien sv3 = new SinhVien("2122110163", "Le Chi Thanh", 18, 8.24);

        ll.add(sv1);
        ll.addLast(sv2);
        ll.addLast(sv3);
        // ll.forEach(System.out::println);
        System.out.println( ll.getFirst());
       
       
    }
}
