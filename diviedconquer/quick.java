package diviedconquer;

public class quick {
    public static void quickSort(int[] arr, int sp , int ep){
if(sp>=ep){
    return;
}

        int pidx = partision(arr, sp, ep);
        quickSort(arr, sp, pidx-1);
        quickSort(arr, pidx+1, ep);
    }
    public static int partision(int[] arr, int sp, int ep){
        int i = sp-1; 
        int pivot = arr[ep];

        for(int j= sp; j<ep; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[ep];
        arr[ep] = temp;
        return i;
    }
    public static void printquicksort(int[] arr, int sp, int ep){

        for(int i=0; i<ep; i++){
            System.out.print(arr[i]+ " ");
        }
    }
         public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printquicksort(arr, 0, arr.length);
    }
}
