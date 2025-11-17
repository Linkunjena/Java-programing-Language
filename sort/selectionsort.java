public class selectionsort {
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int minInd = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minInd]){
                    swap(arr, j, minInd);
                }

            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
          int[] arr = {4, 5, 3, 2, 1 };
          selectionSort(arr);
    }
}
