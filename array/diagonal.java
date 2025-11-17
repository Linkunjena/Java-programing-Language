public class diagonal {
    public static void digonalSum(int[][] arr){
        int sum =0; 
        int n = arr.length;
        int m = arr[0].length;


    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(i==j){
    //                 sum = sum + arr[i][j];
    //             }else if((i+j)==arr.length-1){
    //                 sum = sum + arr[i][j];
    //             }
    //         }
    //     }
    //    System.out.println("The sum is " + sum);

              for(int i=0; i<n; i++){

                sum = sum + arr[i][i];
                if(i != arr.length-1-i){
                    sum = sum + arr[i][arr.length-1-i];
                }
              }
              System.out.println("The sum is: " + sum);



    }
    public static void main(String[] args){
            int arr[][]= 
    {{1, 2, 3, 4},
     {5, 6, 7, 8},
    {9, 10, 11, 12},
    {13, 14, 15, 16},
    } ;

    digonalSum(arr);
    }
}
