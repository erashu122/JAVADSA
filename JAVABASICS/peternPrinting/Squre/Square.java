package JAVABASICS.peternPrinting.Squre;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row & cols: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=m;i++){ //control row
            for (int j = 1; j <=n ; j++) { //control colum
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
