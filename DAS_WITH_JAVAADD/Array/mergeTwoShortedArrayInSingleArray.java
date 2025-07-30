package DAS_WITH_JAVAADD.Array;

import java.util.Arrays;

public class mergeTwoShortedArrayInSingleArray {
    public static void main(String[] args) {
        int[] arr = {11, 23, 45, 67, 90};
        int[] brr = {14, 29, 35, 56, 88};
        int n = arr.length;
        int m = brr.length;

        int[] crr = new int[n + m];
        int i = n-1, j = m-1, k =n+m-1 ;

        // Merge arr and brr into crr
        while (i < n && j < m) {
            if (arr[i] > brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }

        // Copy remaining elements of arr
        while (i < n) {
            crr[k++] = arr[i++];
        }

        // Copy remaining elements of brr
        while (j < m) {
            crr[k++] = brr[j++];
        }

        // Print the merged sorted array
        System.out.print( Arrays.toString(crr));
    }
}