package DAS_WITH_JAVAADD.logic;

import java.util.Arrays;
import java.util.Scanner;

public class searchIn2DArrey {
    public static void main(String[] args) {
        int [][] arr={
                {12,34,55,23},
                {1,4,32,45},
                {37,67,46,98,65}
        };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target value:");
        int target=sc.nextInt();
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[-1];
    }
}
