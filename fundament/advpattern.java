import java.util.Scanner;


public class advpattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println(" Please Enter a number: ");
        int n = scn.nextInt();

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //floyd triangle:-

// int num  = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
// System.out.print(num+" ");
// num++;
//             }
//             System.out.println();
//         }



// 0 and 1 pattern:-

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         if((i+j) % 2 ==0){
//             System.out.print("1"+ " ");
//         }else{
//             System.out.print("0" + " ");
//         }
//     }
//     System.out.println();
// }

//butterfly pattern:-

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     for(int j=1; j<= 2*(n-i); j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


// for(int i=n; i>=1; i--){

//      for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     for(int j=1; j<= 2*(n-i); j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
// System.out.println();
// }




// solid Rhombus


// for(int i= 1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=n; j++){
//         if(i==1 || i==n || j==1 || j==n){
//  System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
       
//     }
//     System.out.println();
// }


// Diamond pattern

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
// System.out.print(" ");
//     }
//     for(int j=1; j<=2*i-1; j++){
// System.out.print("*");
//     }
//     System.out.println();
// }

// for(int i=n; i>=1; i--){
// for(int j=1; j<=n-i; j++){
//     System.out.print(" ");
// }
// for(int j=1; j<= 2*i-1; j++){
//     System.out.print("*");
// }
// System.out.println();
// }


// palindrome pattern

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print(j);
//     }
//     for(int j =i-1; j>=1 ; j--){
//         System.out.print(j);
//     }
//     System.out.println();
// }
// int num = 1;

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
// System.out.print(" \t");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print(num + " \t\t");
//         num++;
//     }
// System.out.println();
// }


for(int i=1; i<=n; i++){
    for(int j=1; j<=n-i; j++){
System.out.print(" ");
    }
    for(int j=1; j<=2*i-1; j++){
        if(i==1 || i==n || j ==1 || j==2*i-1){
System.out.print("*");
        }else{
            System.out.print(" ");
        }

    }
    System.out.println();
}




scn.close();
    }
}
