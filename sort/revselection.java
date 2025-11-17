public class revselection {
    public static void selectionrev(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minval = i;
            for(int j=i+1; j<n; j++){
                if(arr[minval] < arr[j]){
                    int temp = arr[minval];
                    arr[minval] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
            
        }
    }
    public static void main(String[] args){
        int[] arr = {4, 5, 3, 2, 1 };
        selectionrev(arr);

    }
}
