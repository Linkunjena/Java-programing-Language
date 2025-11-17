import java.util.Scanner;

// public class condition {
//     public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter a number:" );
//        int number = scn.nextInt();
//        if(number >= 0){
//         System.out.println("This number is positive");
//        }
//        else{
//         System.out.println("This number is negative");
//        }
//     }
// }


// public class condition {
//     public static void main(String[] args) {
//         double temp = 103.5;
//         if(temp > 100){
//             System.out.println("You hava fever");

//         }else{
//             System.out.println("You do not hava fever.");
//         }
//     }
// }

// public class condition {
//     public static void main(String[] args) {
//         int number = 4;

//         switch (number) {
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             case 6:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Saturday");
//                 break;
//             default:
//                 break;
//         }
//     }
// }


// public class condition {
//     public static void main(String[] args){
//         int a = 63, b = 36;

//         boolean x = (a < b) ? true : false;
//         System.out.println(x);
//         int y = (a > b) ? a : b;
//         System.out.println(y); 
//     }
// }

public class condition {
    public static void main(String[] args){
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter a year: ");
        // int year = scn.nextInt();

        // boolean x = (year % 4 ) == 0;
        // boolean y = (year % 100) != 0;
        // boolean z = (year % 100 )== 0 && (year % 400)== 0;

        // if(x && (y || z)){
        //     System.out.println("This is a Leap Year");
        // }else{
        //     System.out.println("This is not a Leap Year");
        // }


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scn.nextInt();

        if(year % 4 == 0 ){
System.out.println("This is a leap year");
        }else if(year % 400 == 0){
            System.out.println("This is a leap year ");
        }else{
            System.out.println("This is not a Leap year");
        }

        }
    }
