package DAS_WITH_JAVAADD.String;

import java.util.Arrays;

public class shorted {
    public static void main(String[] args) {
        String s="ashutosh";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for (char ele :ch){
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb=new StringBuilder("pandit");
        char[] ph=sb.toString().toCharArray();
        Arrays.sort(ph);
        for (char ele :ph){
            System.out.print(ele);
        }
    }
}
