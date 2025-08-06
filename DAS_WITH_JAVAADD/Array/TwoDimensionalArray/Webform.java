package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

import java.util.Scanner;

public class Webform {
//    public static int[][] taking() {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the Order of Matrix (m*n) :");
//        int m= sc.nextInt();
//        int n= sc.nextInt();
//        int[][] ar = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("Enter the element "+i+" "+j+" :");
//                ar[i][j]=sc.nextInt();
//            }
//            System.out.println();
//        }
//        return ar;
//    }
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
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}} ;
        int m=arr.length, n=arr[0].length;
        System.out.println("Original matrix :");
        print(arr);
        System.out.println("WEBFORM matrix (S):");
        for (int i = 0; i < m; i++) {
            if (i%2==0){
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
            else {
                for (int j =0; j <n; j++) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }
        }
        System.out.println("WEBFORM matrix form ->2:");
        for (int i = 0; i < m; i++) {
            if (i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
            else {
                for (int j =n-1; j >=0; j--) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }
        }
        System.out.println("WEBFORM matrix form ->3:");
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                // Top to bottom
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                // Bottom to top
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();

    }
}
/*Enter the Order of Matrix (m*n) :3 3
Enter the element 0 0 :1
Enter the element 0 1 :2
Enter the element 0 2 :3

Enter the element 1 0 :4
Enter the element 1 1 :5
Enter the element 1 2 :6

Enter the element 2 0 :7
Enter the element 2 1 :8
Enter the element 2 2 :9

Original matrix :
1 2 3
4 5 6
7 8 9

WEBFORM matrix :
1 2 3
6 5 4
7 8 9

WEBFORM matrix 3:
1 4 7
8 5 2
3 6 9
*/
