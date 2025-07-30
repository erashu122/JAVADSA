package DAS_WITH_JAVAADD.Array;

public class shortZeroOneTwoWithThreePointer {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 1, 1, 1, 0, 0, 2, 2};
        int n = arr.length;
        int mid = 0, hi = n - 1, low = 0;

        while (mid <= hi) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // arr[mid] == 2
                // Swap arr[mid] and arr[hi]
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}