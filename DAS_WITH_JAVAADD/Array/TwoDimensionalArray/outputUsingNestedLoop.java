package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Row & Colum :");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        n = arr.length; //no of row
        m=arr[0].length; //no of colum
        System.out.println(n+" "+m);
        // input of 2D Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the Element "+i+" "+j+":");
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
