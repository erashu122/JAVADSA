package peternPrinting.Triangle;

import java.util.Scanner;

public class mixertringle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // Odd row: print numbers starting from 1
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                // Even row: print capital letters starting from 'A'
                for (int j = 0; j < i; j++) {
                    System.out.print((char)('A' + j) + " ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
