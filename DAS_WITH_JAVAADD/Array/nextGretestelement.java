package DAS_WITH_JAVAADD.Array;

public class nextGretestelement {
    public static void main(String[] args) {
         int[] arr={12,8,41,34,23,90,54,32,55,65};
         int n=arr.length;
         int[] ans=new int[n];
         ans[n-1]=-1;
         //method 1:Brute force
        for (int i = 0; i < n-1; i++) {
            int mx=Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++) {
                mx=Math.max(mx,arr[j]);

            }
            ans[i]=mx;
        }
        for (int ele:ans){
            System.out.print(ele+" ");
        }
        System.out.println();

        //method 2:Optimize

        int  nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele:ans){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
