public  class findmax {
    public static void maxElement(int[][] arr){
        int n = arr.length; int m= arr[0].length;
        int maximum = Integer.MAX_VALUE;
        
for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
if(maximum > arr[i][j]){
        maximum = arr[i][j];
}
    }
}
System.out.println(maximum);

    }

    public static void main(String[] args){
         int[][] arr = {{10, 12, 14, 15},
                   {21, 22,24,26},
                {33, 35, 37, 30},
            {50, 55, 52, 45,}};
maxElement(arr);
    }
}