public class revins {
    public static void insertionrev(int[] arr){
        int n= arr.length;

        for(int i=0; i<n; i++){
            int curr = arr[i];
            int prev = i-1; 

            while(prev>=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");

        }
    }
    public static void main(String[] args){
         int[] arr = {4, 5, 3, 2, 1 };
         insertionrev(arr);
    }
}
