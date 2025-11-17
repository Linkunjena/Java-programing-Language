import java.util.Scanner;

public class loop {
    public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter a number: ");
        
//         int n = scn.nextInt();
// int num ;
// int evenSum = 0;
// int oddSum = 0;

//         for(int i=0; i < n; i++){
//             System.out.println("Enter the index "+ i + ": ");
// num = scn.nextInt();
// if(num % 2 == 0){
//     evenSum = evenSum + num;

// }
// else{
//     oddSum = oddSum + num;
// }
//         }
   

        // System.out.println(" The even sum is: " + evenSum);
        // System.out.println("The odd sum is: "+  oddSum);



//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = scn.nextInt();

//         int fact = 1;
//         for(int i  = n; i >= 1; i--){
//            fact = fact * i;
//         }

// System.out.println("fact is: "+ fact);


Scanner scn = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = scn.nextInt();
// System.out.println("Multication table is: ");

// for(int i = 1; i<= 10; i++){
//     System.out.println(number + " * " + i + " = " + number*i);

// }

// int count = 0;

// for(int i = 1; i*i < number; i++ ){
//     if(number % i == 0){
//         count = count +2;

//     }else{

//     }
// }
// if(count == 2){
//     System.out.println("This number is prime.");
// }else{
//     System.out.println("This number is not prime.");


// }
int reverse = 0;

while(num > 0){
    int lastdigit = num % 10 ;
    reverse = (reverse * 10 ) + lastdigit;
    num = num/10;

}
System.out.println(reverse);

        scn.close();

    }
}

