package JAVABASICS.peternPrinting.Spacialpetern;

import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a odd number :");
        int n= sc.nextInt();
        int mi=n/2 +1;

        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n ; j++) {
                if (i==mi || j==mi)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");

            }
            System.out.println();
        }
    }
}
