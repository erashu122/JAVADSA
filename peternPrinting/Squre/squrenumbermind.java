package peternPrinting.Squre;

import java.util.Scanner;

public class squrenumbermind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){ //control row
            for (int j = 1; j <=m ; j++) { //control colum
                System.out.print(i+" "+j);

            }
            System.out.println();
        }

    }
}
