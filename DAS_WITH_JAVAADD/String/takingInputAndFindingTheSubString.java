package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class takingInputAndFindingTheSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String :");
        String s=sc.nextLine();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
