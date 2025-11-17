public class spiral {
    public static void spiralMatrix(int[][] arr){
        int n = arr.length; int m = arr[0].length;
        int sr = 0; 
        int er = n-1;
        int sc = 0;
        int ec = m-1;


        while(sr<=ec && sc <= ec){
            //top 
            for(int j= sc; j<= ec; j++ ){
                System.out.print(arr[sr][j] + " ");
            }

            // right
            for(int i = sr+1; i<=er; i++){
                System.out.print(arr[i][ec] + " ");
            }

            //bottom 
            for(int j= ec-1; j>=sc; j--){
                if(sc ==ec){
                    break;
                }
                
                System.out.print(arr[er][j] + " ");
            }

            //left 
            for(int i=er-1; i>=sr+1; i--){
                if(er == sr){
                    break;
                }
                System.out.print(arr[i][sc] +" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
    }
    public static void main(String[] args){
         int arr[][]= 
    {{1, 2, 3, 4},
     {5, 6, 7, 8},
    {9, 10, 11, 12},
    {13, 14, 15, 16},
    } ;

    spiralMatrix(arr);
    }
}
