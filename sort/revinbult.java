import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class revinbult {
    public static void main(String[] args){
          Integer[] arr = {4, 5, 3, 2, 1 };
Arrays.sort(arr, Collections.reverseOrder() );
for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
}
    }
}
