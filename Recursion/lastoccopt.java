public class lastoccopt {
    public static void  lastidxfind(int[] arr, int key , int i){
if(i < 0){
   System.out.println(-1);
   return ;
}

        if(arr[i] == key){
           System.out.println(i);
           return;
        }
        lastidxfind(arr, key, i-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 7};
        int i = arr.length-1;
        int key = 5;

       lastidxfind(arr, key, i);
    }
}
