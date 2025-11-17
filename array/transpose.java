public class transpose {
    public static void transposeArr(int[][] nums){
        int n = nums.length; 
        int m = nums[0].length;
         
        int[][] matrix = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[j][i] = nums[i][j];
            }
        }
        System.out.println("After Transpose the matrix is: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, 
    {5, 6, 7}};

    System.out.println("Original arays is: ");
    for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums[0].length; j++){
            System.out.print(nums[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

transposeArr(nums);


}

}
