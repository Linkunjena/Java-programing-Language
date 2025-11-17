public class assignment {
    public static void frequencyEle(int[][] arr, int k){
int n = arr.length;
int m = arr[0].length;
int count = 0;

for(int i=0; i<n; i++){
    for(int j=0; j<m; j++ ){
        if(arr[i][j] ==k){
            count++;
        }
    }
}
System.out.println("frequency of the given element is: " + count);
    }
    public static void main(String[] args){
        int[][] arr = {{4, 7, 8}, {8, 8, 7}};
        int k = 7;

        frequencyEle(arr, k);
    }
}
