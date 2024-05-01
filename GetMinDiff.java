import java.util.Arrays;

public class GetMinDiff {

    public static void main(String[] args) {

        int[] arr = { 1, 5, 3, 7 };
        int n = arr.length;
        int k = 2;

        Arrays.sort(arr);

        int diff = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] - k < 0)
                continue;
            int minInRange = Math.min(arr[0] + k, arr[i] - k);
            int maxInRange = Math.max(arr[i - 1] + k, arr[n - 1] - k); // Use i - 1 here

            diff = Math.min(diff, maxInRange - minInRange);
        }
        System.out.println(diff);
    }

}
