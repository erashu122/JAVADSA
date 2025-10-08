package DAS_WITH_JAVAADD.logic;
import java.util.*;
public class clalculater {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator:");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the two number :");
                int num1= sc.nextInt();
                int num2=sc.nextInt();

                if (op=='+') ans=num1+num2;
                if (op=='-') ans=num1-num2;
                if (op=='*') ans=num1*num2;
                if (op=='/') {
                    if (num2==0) {
                        System.out.println("invalid");
                    }
                    else ans=num1/num2;

                }
                if (op=='%') ans=num1%num2;

            }
            else if (op=='x'||op=='X'){
                break;
            }
            else {
                System.out.println("invalid the operator");

            }
            System.out.println(ans);
        }
    }
}