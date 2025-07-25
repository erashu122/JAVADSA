package DAS_WITH_JAVAADD.Array;
// method one
//public class maximamnumberfound {
//    public static void main(String[] args) {
//        int[] arr={23,43,54,65,76,34,56,87};
//        int mx=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>mx) {
//                mx=arr[i];
//            }
//        }
//        System.out.println(mx);
//    }
//}
// method 2

public class maximamnumberfound {
    public static void main(String[] args) {
        int[] arr={23,43,54,65,76,34,56,87};
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx) {
                mx=Math.max(mx,arr[i]);

            }
        }
        System.out.println(mx);
    }
}