package DAS_WITH_JAVAADD.Array;




public class passbyreference {
    public static void main(String[] args) {
        // it will be happend in array
        int [] arr={10,20,30,40,50};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);


    }
    public static void change(int[] arr){
         arr[0]=30;
    }
}
