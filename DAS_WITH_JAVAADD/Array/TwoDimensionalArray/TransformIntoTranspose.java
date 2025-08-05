package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

import java.util.Scanner;

public class TransformIntoTranspose {
    public static int[][] taking() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Order of Square Matrix :");
        int n= sc.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element "+i+" "+j+" :");
                ar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        return ar;
    }
    public static void print(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr=taking();
        int m=arr.length;
        System.out.println("Original matrix :");
        print(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        System.out.println("Transposed Matrix:");
        print(arr);
    }
}
//output :------>
/* Enter the Order of Square Matrix :4

Enter the element 0 0 :12
Enter the element 0 1 :13
Enter the element 0 2 :14
Enter the element 0 3 :11

Enter the element 1 0 :15
Enter the element 1 1 :16
Enter the element 1 2 :17
Enter the element 1 3 :18

Enter the element 2 0 :19
Enter the element 2 1 :20
Enter the element 2 2 :21
Enter the element 2 3 :22

Enter the element 3 0 :23
Enter the element 3 1 :24
Enter the element 3 2 :25
Enter the element 3 3 :26

Original matrix :
12 13 14 11
15 16 17 18
19 20 21 22
23 24 25 26

Transposed Matrix:
12 15 19 23
13 16 20 24
14 17 21 25
11 18 22 26 */