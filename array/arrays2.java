// import java.util.Scanner;


public class arrays2 {
//     public static void subMax(int arr[]){
// int n = arr.length;
// int curr = 0;
// int MaxNum = Integer.MIN_VALUE;

// for(int i=0; i<n; i++){
//     for(int j=i; j<n; j++){
//         curr =0;
//         for(int k= i; k<=j; k++){
//             curr = curr+arr[k];
//         }
//         System.out.println(curr);
//         if(curr>MaxNum){
//             MaxNum = curr;
//         }
//         System.out.println();
//     }
//     System.out.println();
// }
// System.out.println("The maximum sub array is: "+ MaxNum);
//     }
// public static void prefixSubmax(int arr[]){

//     int n = arr.length;
//     int maximum = Integer.MIN_VALUE;
    
//     int prefix[] = new int[n];
//     prefix[0]= arr[0];

//     for(int i=1; i<n; i++){
//         prefix[i] = prefix[i-1] + arr[i];
//     }

//     for(int i=0; i<n; i++){
//        int  sum =0; 
//         for(int j=i; i<n; i++){
//             if(i==0){
//                 sum = prefix[j];
//             }else{
//                 sum = prefix[j]- prefix[i-1];
//             }
//             if(sum > maximum){
// maximum = sum;
//             }
//         }
//     }
//     System.out.println("answer is: "+ maximum);
// }

//public static void kandansMaxsub(int arr[]){
//     int n = arr.length;
//     int MaxNum = Integer.MIN_VALUE;
//     int curr = 0;

//     for(int i=0; i<n; i++){
//         curr = curr + arr[i];
//         if(curr < 0){
// MaxNum = 0;
//         }
//       MaxNum = Math.max(curr, MaxNum);
//     }

// int n = arr.length;
// int MaxNum = Integer.MAX_VALUE;

// int curr =0;
// for(int i=0; i<n; i++){
//  curr = curr + arr[i];

//     if(curr < MaxNum){
//         MaxNum = curr;

//     }
//     Math.max(MaxNum, curr);

    


// }




//     System.out.println("Maximum number is: "+MaxNum);
// }
public static void trappedrainWater(int arr[]){
    int n = arr.length;

    int[] leftMax = new int[n];
     leftMax[0]= arr[0];
    for(int i=1; i<n; i++){
           leftMax[i]= Math.max(arr[i], leftMax[i-1]);
    }

    int[] rightMax = new int[n];
 rightMax[n-1] = arr[n-1];
 for(int i=n-2; i>=0; i-- ){
rightMax[i] = Math.max(arr[i], rightMax[i+1]);
 }

int trapped =0;
 for(int i=0; i<n; i++){
int wavelength =0;
     wavelength = Math.min(leftMax[i], rightMax[i]);
      trapped = trapped + wavelength - arr[i];
 }
System.out.println("Trapped rainwater is: "+ trapped);
}

    public static void main(String[] args){
      
int arr[] = {4, 2, 0, 6, 2, 5};
trappedrainWater(arr);
// int arr[] = {-1, -2, -3};
// subMax(arr);
// prefixSubmax(arr);
// kandansMaxsub(arr);

        
    }
    
}
