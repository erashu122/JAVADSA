package JAVABASICS.loops.GemetricProgresion;

import java.util.Scanner;

public class GemetricProgresionwith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        System.out.print("Enter the A :");
        int a=sc.nextInt();
        System.out.print("Enter the R :");
        int r=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(a);
            a*=r;

        }

    }
}
