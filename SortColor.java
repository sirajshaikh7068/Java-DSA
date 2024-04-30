import java.util.Arrays;

public class SortColor {
    static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            if (nums[i] == 1)
                one++;
            if (nums[i] == 2)
                two++;
        }

        for (int i = 0; i < zero; i++)
            nums[i] = 0;
        for (int i = zero; i < one + zero; i++)
            nums[i] = 1;
        for (int i = one + zero; i < nums.length; i++)
            nums[i] = 2;

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 2, 1, 2, 2, 2, 0, 0 };
        sortColors(nums);
    }
}