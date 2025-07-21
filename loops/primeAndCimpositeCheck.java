package loops;

import java.util.Scanner;

public class primeAndCimpositeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();

        int x = 0; //0 means prime

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                System.out.println("composite Number");
                x = 1;
                break;
            }

        }
        if (n == 1) System.out.println("not prime not composite");
        else if (x == 0) {
            System.out.println("Prime number ");

        }
    }
}