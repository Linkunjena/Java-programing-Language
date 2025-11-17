
 package diviedconquer;

public class searchsort {
public static int sortrotate(int[] arr, int target, int sp, int ep){

    if(sp>ep){
        return -1;
    }


    int mid = sp + (ep - sp)/2;

    if(arr[mid] == target){
        return mid;
    }

    if(arr[sp] <= arr[mid]){
        if(arr[sp] <=  target  && target<= arr[mid]){
            return sortrotate(arr, target, sp, mid-1);
        }else{
            return sortrotate(arr, target, mid+1, ep);
        }
    }


    if(arr[mid] <= arr[ep]){
        if(arr[mid] <= target && target <= arr[ep]){
            return sortrotate(arr, target, mid+1, ep);
        }else{
            return sortrotate(arr, target, sp, mid-1);
        }
    }
return mid;

}
    public static void main(String[] args){

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;
      System.out.println(sortrotate(arr, target, 0, arr.length-1));  
      
    }
}