import java.util.Scanner;

class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n= sc.nextInt();
        if (n%5==0||n%3==0) System.out.println("it is divisibal :");
        else System.out.println("it is not divisible");
    }
}