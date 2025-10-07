package DAS_WITH_JAVAADD.logic;

import java.util.*;
public class penindrom{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int reversed=0;
        while(a!=0){
            int  digit =a%10;
            reversed=reversed*10+digit;
            a=a/10;
        }
        System.out.println("the reversed number is "+reversed);


        if(a==reversed) {System.out.println("number is pelindrom");}
        else {System.out.println("number is not pelindrom");}

    }
}
