import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 1, 2, 2, 2, 3, 3 };
        int arr2[] = { 3, 3, 3, 4, 4, 4, 5, 5 };
        int i = 0;
        int j = 0;

        List<Integer> res = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            // Skip duplicate elements in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicate elements in arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            // Comparison
            if (arr1[i] < arr2[j]) {
                res.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                res.add(arr2[j]);
                j++;
            } else {
                res.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                res.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                res.add(arr2[j]);
            }
            j++;
        }

        System.out.println(res);
    }
}
