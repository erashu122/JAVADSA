package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        for (int i = 0; i < n; i++) {
            char ch=sb.charAt(i);
            int assci=(int)ch;
            if (assci>=65 && assci<=90){
                assci+=32;
                ch=(char) assci;
                sb.setCharAt(i,ch);
            }
            else if (assci>=97 && assci<=122){
                assci-=32;
                ch=(char) assci;
                sb.setCharAt(i,ch);
            }

        }
        System.out.println(sb);
    }
}
