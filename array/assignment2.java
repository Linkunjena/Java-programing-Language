public class assignment2 {
    public static void sumofArrays(int[][] nums){
        int n = nums.length; int m = nums[0].length;
        int sum =0;

        for(int i=0; i<m; i++){
          sum = sum+nums[1][i];
        }
        System.out.println("The sum of the given arrays: " + sum);
    }
    public static void main(String[] args){
        int[][] nums = {{1, 4, 9},
         {11, 4, 3},
          {2, 2, 3}};

          sumofArrays(nums);

    }
}
