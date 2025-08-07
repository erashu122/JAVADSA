package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

import java.util.Scanner;

public class spiralPrint {
    public static int[][] taking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Order of Matrix (m*n) :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element " + i + " " + j + " :");
                ar[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return ar;
    }

    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = taking();
        int m = arr.length, n = arr[0].length;
        System.out.println("Original matrix :");
        print(arr);
        System.out.println("Spiral matrix :");

        // Spiral print
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while (minr <= maxr && minc <= maxc) {
            // left to right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;

            // top to bottom
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;

            // right to left
            if (minr <= maxr) {
                for (int j = maxc; j >= minc; j--) {
                    System.out.print(arr[maxr][j] + " ");
                }
                maxr--;
            }

            // bottom to top
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;
            }
        }

        System.out.println(); // clean ending
    }
}
