package DAS_WITH_JAVAADD.Array;

import java.util.Scanner;

public class inputoutputofArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        // takin input of arrays elements
        for (int i = 0; i <=n-1; i++) {
            arr[i] =sc.nextInt();

        }
        // output
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
