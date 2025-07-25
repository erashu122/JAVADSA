// find the doublet in the array whose sum is equal to the given value x (TWO SUM)
package DAS_WITH_JAVAADD.Array;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,35,24,23,65,43,2,34,4,5,6,7,8,9,10};
        System.out.print("Enter the sum(x):");
        int x=sc.nextInt();
        int n=arr.length;
        System.out.println(n);
//        boolean flag=false;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]+arr[j]==x)
                    System.out.println(i+" "+j);
//                break;

            }
        }
        System.out.println();


    }
}
