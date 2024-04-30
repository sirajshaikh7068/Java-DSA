public class FindingMaXAndMinElement {

    public static void main(String args[]) {
        int[] arr = { 2, 5, 8, 6, 9 };
        FindMaxAndMin(arr);

    }

    static void FindMaxAndMin(int[] arr) {
        int Min = arr[0];
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            Min = Math.min(Min, arr[i]);
            Max = Math.max(Max, arr[i]);

        }
        System.out.println("Maximum-" + Max);
        System.out.println("Minimum-" + Min);
    }
}
