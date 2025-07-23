package JAVABASICS.NORMAL;

import java.util.*;
class gretestnumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Scanner scanner=new Scanner(System.in);
       System.out.print("enter name1 :");
       String name1=scanner.nextLine();
       System.out.print("enter the age");
       int n= sc.nextInt();
       System.out.println("enter name2 :");
       String name2=scanner.nextLine();
       System.out.print("enter the age");
       int p= sc.nextInt();
       System.out.println("enter name3 :");
       String name3=scanner.nextLine();
       System.out.print("enter the age");
       int q= sc.nextInt();
        if(n>p){
            if(n>q) System.out.println(name1+" is youngest then "+name2+","+name3);
            else System.out.println(name3+" is youngest then "+name1+","+name2);
        }
        else {
            if(p>q) System.out.println(name2+" is youngest then "+name3+","+name1);
            else System.out.println(name3+" is youngest then "+name1+","+name2);
        }

    }




}
