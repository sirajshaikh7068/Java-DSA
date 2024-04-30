import java.util.Arrays;

public class NegativeLeftSide {
    public static void main(String[] args) {
        int nums[] = { -6, -9, 5, 4, -8, 5, 1 };
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            while (nums[left] < 0)
                left++;
            while (nums[right] > 0)
                right--;

            if (left > right)
                break;

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

        }
        System.out.println(Arrays.toString(nums));

    }

}
