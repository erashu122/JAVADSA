package DAS_WITH_JAVAADD.logic;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        char ch='x';
        while(true) {
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = ip.nextInt();
            boolean ans = isprime(num);
            if (ans == true) System.out.println(num + " is a Prime number ");
            else System.out.println(num + " is not a prime number");
            if (num=='x'){
                break;

            }
        }


    }
    static boolean isprime( int num){
        if (num<=1) return false;
        int i=2;
        while (i<=num/2){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
