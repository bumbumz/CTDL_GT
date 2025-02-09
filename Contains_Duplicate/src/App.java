import java.util.HashSet;

public class App {

    public static void main(String[] args) throws Exception {

        // Cho một mảng số nguyên nums, trả về true
        // nếu bất kỳ giá trị nào xuất hiện ít nhất hai lần
        // trong mảng và trả về falsenếu mọi phần tử đều khác nhau.

        int[] a = { 1, 2, 3, 4, 5, 5 };

        System.out.println(checkContaints_Dulicate(a));

    }

    public static boolean checkContaints_Dulicate(int[] n) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : n) {
            if (set.contains(integer)) {
                return true;
            }
            set.add(integer);
        }
        return false;
    }

}
