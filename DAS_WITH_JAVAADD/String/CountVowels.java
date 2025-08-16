package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class CountVowels {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your String :");
         String name =sc.nextLine();
         int n=name.length();
         int count=0;
         for (int i = 0; i < n; i++) {
             char ch=name.charAt(i);
             if (isVowels(ch)==true) count++;

         }
         System.out.println(count);
     }

    private static boolean isVowels(char ch) {
         if (ch=='a' || ch=='A') return true;
         if (ch=='e' || ch=='E') return true;
         if (ch=='i' || ch=='I') return true;
         if (ch=='o' || ch=='U') return true;
            else return false;
    }
}
