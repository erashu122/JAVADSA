package DAS_WITH_JAVAADD.logic;

//Swaping Two numbers without using a third variable
import java.util.*;

class SwapingTwoNumber{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A ="+ a);
        System.out.println("B ="+ b);
    }
}