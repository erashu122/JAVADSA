package peternPrinting;

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

    }
}
