package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10,13,14,17}
        };

        int m = a.length;
        int n = a[0].length;

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int i = 0, j = n - 1;
        Boolean found = false; // Using Boolean instead of return

        while (i < m && j >= 0) {
            if (a[i][j] == target) {
                found = true;
                break;
            } else if (a[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println(found);
    }
}
