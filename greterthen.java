import java.util.Scanner;

class greterthen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter teh length of Rectangal :");
        double l=sc.nextDouble();
        System.out.println("enter teh breath of Rectangal :");
        double b=sc.nextDouble();
        double area=l*b ;
        double para=2*(l+b);
        if (l>b) System.out.println("Area of the rectangle is greter then its perimeter");
        else System.out.println("its not true ");
    }
}
