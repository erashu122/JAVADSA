package JAVABASICS.peternPrinting.Squre;

import java.util.Scanner;

public class AlphabetSure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //control row
            for (int j = 1; j <=n ; j++) { //control colum
                System.out.print((char)(j+64) +" ");

            }
            System.out.println();
        }

//     OUTPUT: Enter n: 7
//        B C D E F G H
//        B C D E F G H
//        B C D E F G H
//        B C D E F G H
//        B C D E F G H
//        B C D E F G H
//        B C D E F G H

        Scanner dcc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int p=dcc.nextInt();
        for(int i=1;i<=p;i++){ //control row
            for (int j = 1; j <=p ; j++) { //control colum
                System.out.print((char)(j+96) +" ");

            }
            System.out.println();
        }
//  output:Enter n: 6
//        a b c d e f
//        a b c d e f
//        a b c d e f
//        a b c d e f
//        a b c d e f
//        a b c d e f
        Scanner dbc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int l=dbc.nextInt();
        for(int i=1;i<=l;i++){ //control row
            for (int j = 1; j <=l ; j++) { //control colum
                System.out.print((char)(i+64) +" ");

            }
            System.out.println();
        }

//        Enter n: 6
//        A A A A A A
//        B B B B B B
//        C C C C C C
//        D D D D D D
//        E E E E E E
//        F F F F F F


        Scanner dkc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int m=dkc.nextInt();
        for(int i=1;i<=m;i++){ //control row
            for (int j = 1; j <=m ; j++) { //control colum
                System.out.print((char)(i+96) +" ");

            }
            System.out.println();
        }

//        Enter n: 6
//        a a a a a a
//        b b b b b b
//        c c c c c c
//        d d d d d d
//        e e e e e e
//        f f f f f f

    }
}
