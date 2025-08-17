package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class checkValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Day :");
        String d=sc.next();
        switch (d){
            case "Mon":
                System.out.println("This is tough.");
                break;
            case "Tue":
                System.out.println("This is getting better.");
                break;
            case "Wed":
                System.out.println("Half way there.");
                break;
            case "Thu":
                System.out.println("I can see the light.");
                break;
            case "Fri":
                System.out.println("Now we are talking!");
                break;
            default:
                System.out.println("off day !");
                break;
        }

    }
}
