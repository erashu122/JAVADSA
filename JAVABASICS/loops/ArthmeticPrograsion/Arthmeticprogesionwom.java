package JAVABASICS.loops.ArthmeticPrograsion;

import java.util.Scanner;
// it was the vailed for the +ve and -ev both of them

public class Arthmeticprogesionwom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A :");
        int a=sc.nextInt();
        System.out.print("Enter D :");
        int d=sc.nextInt();
        System.out.print("Enter N :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a +=d;
        }
    }
}
