package DAS_WITH_JAVAADD.Array;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr = {11, 23, 45, 67, 90};
        int[] brr = {14, 29, 35, 56, 85,88,89,};

        int n = arr.length;
        int m = brr.length;

        int[] crr = new int[n + m];

        int i = n - 1, j = m - 1, k = n + m - 1;

        // Merge from end
        while (i >= 0 && j >= 0) {
            if (arr[i] > brr[j]) {
                crr[k--] = arr[i--];
            } else {
                crr[k--] = brr[j--];
            }
        }

        // Copy remaining elements
        while (i >= 0) {
            crr[k--] = arr[i--];
        }

        while (j >= 0) {
            crr[k--] = brr[j--];
        }

        // Output result
        System.out.println(Arrays.toString(crr));
    }
}
