import java.util.Arrays;

public class KthLargestElement {
    public static void main(String args[]) {
        int nums[] = { 18, 13, 8, 9, 12 };
        int k = 3;
        Arrays.sort(nums);
        System.out.println(nums[k - 1]);
    }

}
