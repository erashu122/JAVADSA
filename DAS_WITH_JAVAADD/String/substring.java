package DAS_WITH_JAVAADD.String;

public class substring {
    public static void main(String[] args) {
        String s="absdfe";
        int n=s.length();
//        System.out.println(s.substring(0,5));
//        System.out.println(s.substring(0,n));
//        System.out.println(s.substring(0,1));
//        System.out.println(s.substring(1,n));
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n ; j++) {
                System.out.print(s.substring(i,j)+" ");

            }
            System.out.println();
        }
    }
}
