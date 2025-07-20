import java.util.*;
public class profitorloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price:");
        int cp=sc.nextInt();
        System.out.print("Enter the selling price:");
        int sp=sc.nextInt();
        int amount=sp-cp;
        if(sp>cp){
            System.out.println("Profit");
        }
        else if(cp>sp){
            System.out.println("Loss");
        }
        else{
            System.out.println("No Profit No Loss");
        }
        System.out.println("Amount: " + Math.abs(amount));
        sc.close();
    }
}
