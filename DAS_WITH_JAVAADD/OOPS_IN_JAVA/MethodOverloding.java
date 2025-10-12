package DAS_WITH_JAVAADD.OOPS_IN_JAVA;

public class MethodOverloding{
    public static void main (String [] args){
        greet obj=new greet();
        obj.greeting();
        obj.greeting("Ashutosh");
        obj.greeting("Suraj",10);
    }
    static class greet{
        void greeting(){
            System.out.println("Hello,good morning !");
        }
        void greeting(String name ){
            System.out.println("Hello,"+name+" good morning !");
        }
        void greeting(String name ,int count ){
            for (int i=0;i<=count;i++){
                System.out.println("Hello,"+name+" good morning !");
            }
        }
    }
}