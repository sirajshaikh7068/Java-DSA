import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int nums1[] = { 4, 7, 9, 7, 6, 7 };
        int nums2[] = { 5, 0, 0, 6, 1, 6, 2, 2, 4 };

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[i]) {
                    res.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        System.out.println(res);
    }
}
