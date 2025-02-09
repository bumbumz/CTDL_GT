import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    // Cho một mảng các chuỗi strs, nhóm tất cả các đảo chữ
    // cái lại với nhau thành danh sách con. Bạn có thể trả lại đầu ra theo bất kỳ
    // thứ tự nào.

    // Đảo chữ là một chuỗi chứa các ký tự giống hệt như một chuỗi khác, nhưng thứ
    // tự các ký tự có thể khác nhau.
    public static List<List<String>> Prerequisites(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String string : strs) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String strLastSort = new String(charArray);
            res.putIfAbsent(strLastSort, new ArrayList<>());
            res.get(strLastSort).add(string);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) throws Exception {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> res = Prerequisites(strs);
        res.forEach(System.out::println);
    }
}