public class sortedArray {
    public static boolean sort(int[] arr, int i){

        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

    return    sort(arr, i+1);

    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 60, 50};
        int i =0;
       System.out.println(sort(arr, i));
    }
    
}
