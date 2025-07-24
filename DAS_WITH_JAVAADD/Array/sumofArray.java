package DAS_WITH_JAVAADD.Array;

public class sumofArray {
    public static void main(String[] args) {
        int[] arr={12, 34, 5, 4, 23, 43, 53, 34, 54, 234};
        int n=arr.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum +=arr[i];

        }
        System.out.println(sum);
    }
}
