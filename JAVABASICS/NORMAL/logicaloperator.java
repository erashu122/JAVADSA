package JAVABASICS.NORMAL;

import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n= sc.nextInt();
        if(9999<n && n<10000){
            System.out.println("it is the five dogit number !");
        }else System.out.println("is note a five digit number !");
    }
}
