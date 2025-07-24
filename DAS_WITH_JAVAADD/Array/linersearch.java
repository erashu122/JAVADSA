package DAS_WITH_JAVAADD.Array;

import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr={12,23,43,23,45,65,75,73};
        boolean flag=false; //false means not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                flag=true; // true means found
                break;
            }
        }
        if(flag==true) System.out.println("element is found ");
        else System.out.println("element is not found ");
    }
}
