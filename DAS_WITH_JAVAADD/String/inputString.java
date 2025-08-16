package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        //method 1
        String s=new String();
        //method 2
//        String d="Ashutosh kumar ";
//        System.out.print(d);
        //taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name =sc.next(); //it will be taking the only one word not taking full of the sentence
        System.out.print("Hiii, my name is "+name);
        System.out.println();
        Scanner sCC=new Scanner(System.in);
        System.out.print("Enter your name :");
        String as=sCC.nextLine(); //it will be taking full sentence from given by the user
        System.out.println("hy ,My self "+as);

        int n=name.length();
        int m=as.length();

        System.out.println("length of first input :"+n+" length of second input :"+m);




    }
}
