package DAS_WITH_JAVAADD.Array;

import java.util.Scanner;

public class printroll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arr(no of student) :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i]<35) System.out.print(i+" ");

        }
    }
}
