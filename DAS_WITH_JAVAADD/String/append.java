package DAS_WITH_JAVAADD.String;

public class append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.append(123);
        System.out.println(sb);
        sb.append("*^");
        System.out.println(sb);
//        int[] arr={1,2,3,4,5,5};
//        sb.append(arr); //is not work it was the printing the array address
        char[] ch={'a','b','c'};
        sb.append(ch);
        System.out.println(sb);
        StringBuilder t=new StringBuilder("wnjdvh");
        sb.append(t);
        System.out.println(sb);

    }
}
