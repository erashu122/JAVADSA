package DAS_WITH_JAVAADD.logic.BinerySearch;

public class searchingAtargetelement {
    public static void main(String[] args) {
        int [] arr={2,5,6,7,8,11,34,56,76,87,98};
        int target =5;
        int n=arr.length;
        int m=n/2;
        if (arr[m]==target){
            System.out.println(m);

        }
        else if (target>arr[m]){
            for (int i = m; i < arr.length ; i++) {
                if (target==arr[i])
                    System.out.println(i);

            }
        }
        else {
            for (int i = 0; i <m; i++) {
                if (target==arr[i])
                    System.out.println(i);

            }
        }
    }
}
