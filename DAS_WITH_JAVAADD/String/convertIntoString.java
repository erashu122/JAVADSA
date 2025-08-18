package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class convertIntoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the String:");
//        String s=sc.next();
//        System.out.print("Enter the integer number :");
//        int num=sc.nextInt();
//        String p=s+num;
//        System.out.println(p);
        System.out.print("Enter the integer number :");
        int n=sc.nextInt();
        String t=Integer.toString(n);
        System.out.println(t.length());

    }

}
