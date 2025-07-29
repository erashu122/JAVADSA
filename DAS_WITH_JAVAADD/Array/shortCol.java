/*

 Qus--> Sort the Array of 0's, 1's and 2's.(Dutch Flag Algorithm)

*/
package DAS_WITH_JAVAADD.Array;

public class shortCol {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 1, 1, 1, 0, 0, 2, 2};
        int n = arr.length;

        int noOfZero = 0;
        int noOfOne = 0;

        // Count 0s and 1s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZero++;
            else if (arr[i] == 1) noOfOne++;
            // We don't need to count 2s because:
            // number of 2s = total - (noOfZero + noOfOne)
        }

        // Fill the array: 0s → 1s → 2s
        for (int i = 0; i < n; i++) {
            if (i < noOfZero)
                arr[i] = 0;
            else if (i < noOfZero + noOfOne)
                arr[i] = 1;
            else
                arr[i] = 2;
        }

        // Print result
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}