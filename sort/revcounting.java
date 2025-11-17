public class revcounting {
    public static void countingrev(int[] arr){

        int n = arr.length;
    int max = Integer.MIN_VALUE;

    for(int i=0; i<n; i++){
        if(arr[i] > max){
        max = arr[i];
        }

    }
        int[] count = new int[max+1];

        for(int i=0; i<count.length; i++){
        count[arr[i]]++;
        }
int j=0;
        for(int i=0; i<count.length; i++){
            arr[j] = i;
            j++;
            count[i]--;

       }



    }
    public static void main(String[] args){
     int[] arr = {4, 5, 3, 2, 1 };
     countingrev(arr);
    }
}
