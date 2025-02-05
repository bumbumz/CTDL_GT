import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        AVG l = new MathList<Double>(List.of(1.2, 2.2, 3.0, 4.0, 5.7));
        Integer[] a = { 1, 2, 3, 4 };

        AVG m = new MathMang<Integer>(a);
        System.out.println("AVG cua list:" + l.avg());
        System.out.println("AVG cua mang:" + m.avg());
    }
}
