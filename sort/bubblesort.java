public class bubblesort {

    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void bubble(int arr[]){
        int n = arr.length;

        for(int i=1; i<=n; i++){
for(int j=0; j<n-i; j++){
    swap(arr, j, j+1);
}
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
          int[] arr = {4, 5, 3, 2, 1 };
          bubble(arr);
    }
   
}
