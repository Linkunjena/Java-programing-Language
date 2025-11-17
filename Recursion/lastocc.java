package Recursion;

public class lastocc {
    public static int  lastoccurance(int[] arr,int  key, int i){

        if(i == arr.length){
            return -1;
        }


     int   isfound = lastoccurance(arr, key, i+1);
     if(isfound == -1 && arr[i]==key){
        return i;
     }
     return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, 40, 50, 50, 70};
        int key = 50;
        int i=0;
        System.out.println(lastoccurance(arr,key, i));

    }
}
