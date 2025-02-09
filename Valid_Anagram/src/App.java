import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static boolean Valid_Anagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) throws Exception {

        System.out.println(Valid_Anagram("abs", "asb"));
    }
}
