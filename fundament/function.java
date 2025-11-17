import java.util.Scanner;

// public class function {
//    public static void main(String[] args){

//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int m = scn.nextInt();
//     int l = scn.nextInt();

//     int result = avergeNum(n, m, l);
//     System.out.println(result);
//    } 
//    public static int avergeNum (int a , int b, int c){

//     int ans = (a+b+c)/3;
//     return ans ;
//    }
// }


// public class function{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         // boolean ans = isEven(n);

//         // if(ans == true){
//         //     System.out.println("This number is even.");
//         // }else{
//         //     System.out.println(" This number is odd");
//         // }

// boolean ans = isPalindrome(n);

// if(ans == true){
//     System.out.println("This number is Palindrome");
// }else{
//     System.out.println("This number is not Palindrome");
// }
       
//         scn.close();
//     }
//     // public static boolean isEven(int n ){

//     //     if(n%2 == 0){
//     //         return true;
//     //     }
//     //     return false;
//     // }


//     public static boolean isPalindrome(int n){

//         int realNum = n;
//         int reverse = 0;

//         while(realNum != 0){
//           int  lastDigit = realNum % 10 ;
// reverse = (reverse *10) + lastDigit;
// realNum = realNum / 10;

//         }

//         if(n == reverse){
//             return true;
//         }
//         return false;
//     }
    
// }


public class function {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = sumNum(n);
        System.out.println(ans);
    }
    public static int sumNum(int n){
        int realNum = n;
        int sum = 0;

        while(realNum != 0){
            int lastNum = realNum % 10;
            sum = sum + lastNum;
            realNum = realNum / 10;

        }
        return sum;
    }
}