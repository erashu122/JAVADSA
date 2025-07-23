package JAVABASICS.peternPrinting.Squre;

import java.util.Scanner;

class NumbersQure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){ //control row
            for (int j = 1; j <=num ; j++) { //control colum
                System.out.print(j+" ");

            }
            System.out.println();
        }
// output: Enter n: 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
        Scanner dc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=dc.nextInt();
        for(int i=1;i<=n;i++){ //control row
            for (int j = 1; j <=n ; j++) { //control colum
                System.out.print(i+" ");

            }
            System.out.println();
        }
        //output: Enter n: 5
        //1 1 1 1 1
        //2 2 2 2 2
        //3 3 3 3 3
        //4 4 4 4 4
        //5 5 5 5 5
    }
}
