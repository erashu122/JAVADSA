package DAS_WITH_JAVAADD.Array;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[] arr = {32, 23, 2, 31, 43, 44};
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();
        //shallow copy
        int[] nums = arr;
        nums[0] = 90;
        System.out.println(nums[0]);
//        for(int ele :nums){
//            System.out.print(ele+" ");
//        }
        //deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 50;
        for (int ele : brr) {
            System.out.print(ele + " ");

        }

    }
}
