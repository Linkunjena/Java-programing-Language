import java.util.Scanner;

// public class binary {
//     public static void main (String[] args){
//         Scanner scn  = new Scanner(System.in);
//         System.out.println("Enter a binary number");
//         int n = scn.nextInt();

// int realNum = n;
//         int result = 0;
//         int power = 0;
//       boolean  isBinary = true;
//         while(realNum > 0){
//             int lastDigit = realNum % 10;

//             if(lastDigit != 0 && lastDigit != 1){
//                     isBinary = false;
//                     break;
//             }
//             result = result + (lastDigit * (int)Math.pow(2, power));
//             power++;
//            realNum = realNum/10;
//         }
//        if(isBinary){
//          System.out.println(n+ " number decimal form is : "+result);
//        }else{
//         System.out.println("This number is invalid input only input 0 & 1");
//        }
//         scn.close();
//     }
// }



// public class binary{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter a decimal number: ");
//         int n = scn.nextInt();

//        int realNum =n;
//        int sum = 0;
//        int power= 0;
// boolean isBinary = true;
      
       
//        while(realNum > 0){
//         int ls  = realNum % 2;
        
//         sum = sum + (ls * (int)(Math.pow(10, power)));
       
//         power++;
//         realNum = realNum /2;

//        }
// System.out.println(n + " conversion to binary form is :" + sum);
           
//     }
// }



// public class binary{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

  
//     primeinRange(n);

//     }
//     public static void primeinRange(int n){
//         for(int i=1; i<= n; i++){
//             if(isprime(i)){
// System.out.print(i + " ");
//             }
//         }

//     }
// public static boolean  isprime(int n){

//     for(int i=2; i <= Math.sqrt(n); i++){
//         if( n % i==0){
//             return false;
//         }
//     }
//     return true;
// }
    
//     }

// public class binary{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         int realNum = n;
//         int result = 0; 
//         int power = 0;
//         while(realNum>0){
//             int lastDigit = realNum % 10;
//             if(lastDigit != 0 && lastDigit != 1){
//                 System.out.println("Invalid Input please enter binary number:");
//                 break;
//             }
//             result  = result + lastDigit *(int ) Math.pow(2, power);
// power++;
// realNum = realNum /10;
//         }
//         System.out.println(result);
//     }
// }


public class binary{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int realNum =n; 
        int result =0;
        int power = 0;
        while(realNum >0){
            int lastDigit = realNum % 2;
            result = result + lastDigit *(int) (Math.pow(10, power));
            power++;
            realNum = realNum / 2;
        }
        System.out.println(result);
    }
}

