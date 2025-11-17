public class arrays {
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int k = 10;
        int ans = linearSearch(arr, k);
        System.out.println(ans);

        int arr[] = {1, 2, 6, 3, 5, 4};

         int result = largestNum(arr);
         System.out.println(result);



        int arr[] = {2, 4, 6, 8, 10 };
        subArray(arr);

        printPair(arr);
        int k = 12;
        int ans = binarySearch(arr, k);
        System.out.println(ans);

         reverse(arr);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
         }
    }
    public static void subArray(int arr[]){
        int ts =0;

        for(int i=0; i<arr.length; i++){
            int start =i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArray is: " + ts);

        
    }





// public static void printPair(int arr[]){
//     int tp = 0; 

//     for(int i=0; i<arr.length; i++){
//         int curr = arr[i];
//         for(int j=i+1; j<arr.length; j++){
//             System.out.print("(" + curr + "," + arr[j] + ")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println(tp);
// }
    // public static void reverse(int arr[]){
        
    //     int start = 0; 
    //     int end = arr.length-1;
    //     while(start < end){
    //         int temp = arr[start];
    //         arr[start]= arr[end];
    //         arr[end]= temp;
    //         start++;
    //         end--;
    //     }
    // }

    // public static int binarySearch(int arr[], int k){
    //     int n = arr.length;
    //     int start = 0;
    //     int end = arr.length;

    //     while(start <= end){
    //         int mid = (start + end) /2;
    //         if(arr[mid] == k){
    //             return mid;

    //         }
    //         else if(arr[mid] < k){
    //             start = mid +1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static int linearSearch(int arr[] , int k){
    //     int n = arr.length;

    //     for(int i=0; i<n; i++){
    //         if(arr[i]==k){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int largestNum(int arr[] ){
    //     int n = arr.length;
    // int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;

    // for(int i=0; i<n; i++){
    //     if(largest < arr[i]){
    //         largest = arr[i];
    //     }
    //     if(smallest > arr[i]){
    //         smallest = arr[i];
    //     }
    // }
    // System.out.println("The smallest value is: " + smallest);
    // return largest;
    // }
}
