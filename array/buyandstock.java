public class buyandstock {
    public static int buySell(int[] arr){
        int buy = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i< arr.length; i++){
            if(buy < arr[i]){
                int profit = arr[i] - buy;
                max = Math.max(max, profit );

            }else{
                buy = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        int TotalProfit = buySell(arr);
        System.out.println("The maximum profit is: " + TotalProfit);
    }
}
