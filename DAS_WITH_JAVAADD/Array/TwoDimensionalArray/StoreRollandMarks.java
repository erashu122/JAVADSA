package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

import java.util.Scanner;

public class StoreRollandMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of number of student & Colum :");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        // input of 2D Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the roll & marks :");
                arr[i][j]=sc.nextInt();
            }

        }
        // output of 2D Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
