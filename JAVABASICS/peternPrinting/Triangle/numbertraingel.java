package JAVABASICS.peternPrinting.Triangle;

import java.util.Scanner;

public class numbertraingel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
//        Enter the number: 6
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        6 6 6 6 6 6


    }
}
