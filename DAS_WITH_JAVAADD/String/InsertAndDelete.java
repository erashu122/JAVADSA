package DAS_WITH_JAVAADD.String;

public class InsertAndDelete {
    public static void main(String[] args) {
        //deletion
        StringBuilder sb= new StringBuilder("absdfg");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        //insertion
        sb.insert(2,"cudhu");
        System.out.println(sb);
        sb.insert(4,'w');
        System.out.println(sb);
        sb.insert(5,55);
        System.out.println(sb);

    }
}
