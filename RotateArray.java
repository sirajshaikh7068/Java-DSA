import java.util.Arrays;

public class RotateArray {
    public static void reverseArray(int nums[], int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int n = nums.length;

        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));

    }
}
