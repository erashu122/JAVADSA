package DAS_WITH_JAVAADD.Array;

public class sortArray {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,0,1,1,1,0,0};
        int n=arr.length;
 //       int noofZero=0;
//        METHOD 1
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==0) noofZero++;
//        }
//        for (int i = 0; i < n; i++) {
//            if (i<noofZero) arr[i]=0;
//            else arr[i]=1;
//        }
//        for (int ele :arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();


        //METHOD 2 --> TWO PAS SOLUTION

        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if (i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println( );



    }
}
