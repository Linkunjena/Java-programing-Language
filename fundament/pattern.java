import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();


        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }


        // for(int i = n; i >=1; i--){
        //    for(int j = 1; j<=i; j++ ){
        //     System.out.print(" * ");
        //    }
        //     System.out.println();
        // }

// int num = 5;
//         for(int i=1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
            
//               System.out.print( j+ " ");
                 

//             }
//             System.out.println();
//         }
// char ch = 'A';
// for(int i=1; i<=n; i++){
//     for(int j =1; j<= i; j++){
// System.out.print(ch + " ");
//            ch++;
//     }
//     System.out.println();
// }


// int m  = scn.nextInt();

// for(int i=0; i<n; i++){
//     for(int j =0; j<=m; j++){
//         if(i==0 || i== n-1 || j == 0 || j == n-1){
//             System.out.print(" * ");

//         }else{
//             System.out.print("   ");
//         }
//     }
//     System.out.println();
// }


// for(int i=n; i >=1; i--){
//     for(int j = 1; j<i; j++){
//         System.out.print("   ");
//     }
//     for(int j = 0; j<= n-i; j++){
//         System.out.print(" * ");
//     }
//     System.out.println();
// }


// for(int i=n; i>=1; i--){
//     for(int j=1; j<=i; j++){
//         System.out.print(j + " ");
//     }
//     System.out.println();
// }

// for(int i=1; i<= n; i++){
//     for(int j=1; j<=i; j++){
//         if((i+j)%2==0){
//             System.out.print(1 + " ");
//         }else{
//             System.out.print(0 + " ");
//         }
    
//     }
//     System.out.println();
//}


// int nsp = n/2;
// int nst = 1;

// for(int i=1; i<=n; i++){
//     for(int j =1; j <= nsp; j++){
// System.out.print("   ");
//     }
//     for(int k =1; k<=nst; k++){
//         System.out.print(" * ");
//     }
//     if(i <= n/2){
//         nsp = nsp-1;
//         nst = nst+2;
//     }else{
//         nsp = nsp+1;
//         nst = nst-2;
        
//     }
//     System.out.println();
// }


// for(int i=1; i<=n; i++){
//     for(int j =1; j<=i; j)
// }



// for(int i=0; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int k=1; k<=i; k++){
// System.out.print("*");
//     }
//     System.out.println();
// }


// for(int i=1; i<=n;i++){
// for(int j=1; j<=m; j++){
//     if(i==1 || i==n || j==1 || j==m ){
//        System.out.print(" * ");
//     }else{
//         System.out.print("   ");
//     }
   
// }
//  System.out.println();
// }





// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int k =1; k<=i; k++){
//         System.out.print(i + " ");
//     }
//     System.out.println();
// }


// for(int i=n; i>=1; i--){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }for(int k =1; k<=i; k++){

//     System.out.print("* ");
//     }
//     System.out.println();
//}




// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print("  ");
//     }
//     for(int k=i; k>=1; k--){
//         System.out.print(k + " ");
//     }
//     for(int l= 2; l<=i; l++){
//         System.out.print(l + " ");
//     }
//     System.out.println();
// }



// butterfly pattern


// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();


// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     for(int j=1; j<=2*(n-i); j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// for(int i=n; i>=1; i--){
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



//hollow rambhus 


Scanner scn = new Scanner(System.in);
int n = scn.nextInt();

for(int i=1; i<=n; i++){
    for(int j=1; j<= n-i; j++){
        System.out.print(" ");
    }
    for(int j=1; j<=n; j++){
        if(i==1 || i==n || j==1 || j==n){
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
