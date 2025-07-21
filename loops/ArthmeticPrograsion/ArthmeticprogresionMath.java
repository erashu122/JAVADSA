package loops.ArthmeticPrograsion;

import java.util.Scanner;

public class ArthmeticprogresionMath {
    public static void main(String[] args) {
        Scanner dc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=dc.nextInt();
        for (int i=1;i<=(2*n-1);i+=2){
            System.out.println(i);
        }
    }
}
