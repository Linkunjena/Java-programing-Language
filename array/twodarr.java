public class twodarr {
public static void findEle(int[][] arr, int k){
    int n = arr.length; int m = arr[0].length;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(arr[i][j] ==k){
                System.out.println("(" + i + "," + j + ")");
                break;
            
            }
        }
    }
    System.out.println("Element is not find: ");
            
            
        
}
public static void main(String[] args){
    int[][] arr = {{10, 12, 14, 15},
                {21, 22,24,26},
                {33, 35, 37, 30},
            {50, 55, 52, 45,}};

int k = 51;
    findEle(arr, k);
}
    
}