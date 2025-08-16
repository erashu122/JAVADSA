package DAS_WITH_JAVAADD.String;

public class indexingCompare_both {
    public static void main(String[] args) {
        String a="abcd ";
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("p"));

        String b="abdf";
        System.out.println(a.compareTo(b));

        String d="ashutosh kumar pandit";
        System.out.println(d.contains("wer") +" "+d.startsWith("ashu"));
        System.out.println();
    }


}
