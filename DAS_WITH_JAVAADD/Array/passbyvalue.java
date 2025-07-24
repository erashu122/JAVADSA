package DAS_WITH_JAVAADD.Array;

public class passbyvalue {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);
        change();
        System.out.println(x);
    }

    private static void change() {
        int x=10;
    }
}
