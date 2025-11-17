// public class sortedmatrix {
//     public static  void  searchsortMatrix(int[][] matrix, int k){
//         int row = 0; 
//         int col = matrix[0].length-1;
       
//         while(row < matrix.length && col>=0){
//             if(matrix[row][col] == k){
//              System.out.print("(" + row + "," + col + ")");
//             return ;
            
//             }

//             else if(k < matrix[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//         }
//       System.out.println("Element are not found in this array");
        
//     }
//     public static void main(String[] args) {
//         int[][] matrix = 

//         int k = 50;
//         searchsortMatrix(matrix, k);
// }
// }


public class sortedmatrix {
    public static  void searchKey(int[][] matrix, int key){
        int row =matrix.length-1; 
        int col = 0;

        while(col < matrix.length && row >= 0){
            if(matrix[row][col] == key){
System.out.println("The given element index is: " + "(" + row + "," + col + ")");
break;


            }else if(key < matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Given index not exit in the matrix");
    }

    public static void main(String[] args){
        int[][] matrix = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
        int key = 30;

        searchKey(matrix, key);
    }
}