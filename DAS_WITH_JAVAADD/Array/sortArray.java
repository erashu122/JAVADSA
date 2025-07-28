package DAS_WITH_JAVAADD.Array;

public class sortArray {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,0,1,1,1,0,0};
        int n=arr.length;
        int noofZero=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) noofZero++;


        }
        for (int i = 0; i < n; i++) {
            if (i<noofZero) arr[i]=0;
            else arr[i]=1;


        }

    }
}
