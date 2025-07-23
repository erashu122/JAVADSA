package JAVABASICS.peternPrinting.Triangle;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
        //same as not change in the j change in the i and reverse it like
        //I want to print reverse

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
