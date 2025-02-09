public class App {
    // Cho một mảng các số nguyên nums và một số nguyên target,
    // trả về các chỉ số ivà jsao cho nums[i] + nums[j] == targetvà i != j.
    // Bạn có thể cho rằng mỗi đầu vào có đúng một cặp chỉ số ivà jthỏa mãn điều
    // kiện.
    public static int[] Tow_Sum(int[] nums, int target) {
        int[] kq = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    kq[0] = i;
                    kq[1] = j;
                }
            }
        }
        return kq;
    }

    public static void main(String[] args) throws Exception {
        int[] a = { 3, 4, 5, 6 };
        int[] kq = Tow_Sum(a, 7);
        for (int i : kq) {
            System.out.println(i);

        }
    }
}
