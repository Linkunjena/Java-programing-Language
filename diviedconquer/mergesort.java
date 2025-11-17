package diviedconquer;

public class mergesort {
    public static void sortmerge(int[] arr, int sp , int ep){
      
        if(sp >= ep){
return ;
        }

        //find mid
        int mid = sp + (ep-sp)/2;
        sortmerge(arr, sp, mid);
        sortmerge(arr, mid+1, ep);

        merge(arr, sp , mid, ep);


       
    }
    public static void merge(int[] arr, int sp, int mid, int ep){
        int[] temp =new  int[(ep-sp)+1];
        int i = sp;
        int j = mid+1; 
        int k= 0; 

        while(i<=mid && j <= ep){
        if(arr[i] < arr[j]){
    temp[k] = arr[i];
    i++;
   
}else{
    temp[k] = arr[j];
    j++;
   
}
 k++;
        }

        while(i<= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ep){
            temp[k++]  = arr[j++];
        }
for( k=0, i=sp; k<temp.length; k++, i++){
    arr[i]= temp[k];
}

    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
            int sp = 0;
            int ep = arr.length-1;
      sortmerge(arr, sp, ep);
      for( int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
    
            
    }
}
