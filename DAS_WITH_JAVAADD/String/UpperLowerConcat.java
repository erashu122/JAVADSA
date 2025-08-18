package DAS_WITH_JAVAADD.String;

import java.util.Locale;

public class UpperLowerConcat {
    public static void main(String[] args) {
        String s="Ashutosh kumar pandit";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);

        String a="Ashutosh ";
        String b="kumar pandit";
        System.out.println(a.concat(b));
        System.out.println(a);
        a=a.concat(b);
        System.out.println(a);
        System.out.println();

    }
}
