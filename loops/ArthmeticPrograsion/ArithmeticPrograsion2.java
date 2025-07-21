package loops.ArthmeticPrograsion;

import java.util.Scanner;
// display this AP-4,7,10,13,16...up to 'nth term
public class ArithmeticPrograsion2 {
    public static void main(String[] args) {
        Scanner dc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=dc.nextInt();
        for (int i=4;i<=3*n+1;i+=3) System.out.println(i);
    }
}
