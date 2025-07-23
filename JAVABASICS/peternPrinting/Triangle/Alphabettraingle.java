package JAVABASICS.peternPrinting.Triangle;

import java.util.Scanner;

public class Alphabettraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("printing A B C D E.....");

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (i+64)+" ");

            }
            System.out.println();

        }
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        F F F F F F
        System.out.println();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (j+64)+" ");

            }
            System.out.println();

        }
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F
        System.out.println("printing a b c d ..........");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (i+96)+" ");

            }
            System.out.println();

        }
//        a
//        b b
//        c c c
//        d d d d
//        e e e e e
//        f f f f f f

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (j+96)+" ");

            }
            System.out.println();

        }

//        a
//        a b
//        a b c
//        a b c d
//        a b c d e
//        a b c d e f

    }
}
