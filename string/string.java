import java.util.*;


// public class string {
    // public static void printString(String st){
    //     for(int i=0; i<st.length(); i++){
    //         System.out.print(st.charAt(i)+ " ");
    //     }
    // }
    // public static void main(String[] args){
    // //     char[] ch = {'L', 'i', 'n', 'k', 'u', 'n'};
    // //     for(int i=0; i<ch.length; i++){
    // //         System.out.print(ch[i]+" ");
    // //     }
    // // String st = "Linkunjena";
    // // String st2 = "linkunjena1@gmail.com";

    // // System.out.println(st);
    // // System.out.println(st2);


    // // Scanner scn = new Scanner(System.in);
    // // String str = scn.nextLine();

    // // System.out.println(str);

    // // String st = "Linkun jena";
    // // System.out.println(st.length());

    // String firstName = "Linkun";
    // String lastName = "Jena";
    
    // // String fullName = firstName + " " + lastName;
    // // System.out.println(fullName +" " +  "is this.");
    // // System.out.println(fullName.charAt(1));

    // String st = "Linkun Jena";
    // printString(st);

    // }
//     public static boolean checkPalindrome(String str){
//         int n = str.length();
//         for(int i=0; i<str.length()/2; i++){
              
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 return false;
//             }

//         }
//         return true;
//     }
//     public static void main(String[] args){
//         String str = "noon";
//         System.out.println(checkPalindrome(str));
//     }
// }



// public class string {
//     public static float sortestPath(String path){
//         int n = path.length();
//         int x = 0;
//         int y = 0; 

//         for(int i=0; i<n; i++){

//             int dir = path.charAt(i);

//             if(dir == 'E'){
//                  x++;

//             }else if(dir == 'W'){
//                 x--;
//             }else if(dir == 'N'){
//                 y++;
//             }else{
//                 y--;
//             }
//         }

//         int x2 = x*x;
//         int y2 = y*y;

//         float ans = (float)Math.sqrt(x2 + y2);
//         return ans;
//     }

//     public static void main(String[] args){
//         String path = "NNNSENW";

//         System.out.println(sortestPath(path));
//     }
// }



public class string {

    public static void main(String[] args){
        // String str1 = "Hello World";
        // String str2 = "Hello";

        // String str3 = new String("Hello");


        // if(str1== str2){
        //     System.out.println("this is same string");
        // }else{
        //     System.out.println("this is not same string");
        // }


        //  if(str1  == str3){
        //     System.out.println("this is same string");
        // }else{
        //     System.out.println("this is not same string");
        // }

        // if(str1.equals(str3)){
        //     System.out.println("this is same string");

        // }else {
        //     System.out.println("this is not same string");
        // }

// int sp = 0;
// int ep = 5;
// String subString = " ";
//         for(int i=sp; i<ep; i++){
//                subString += str1.charAt(i); 
//         }
//         System.out.println(subString);

//   System.out.println( str1.substring(sp, 4));    



String st = "hello";


for(char ch='a'; ch<='z'; ch++){
    st += ch;
}
System.out.println(st);

StringBuilder sb = new StringBuilder(" ");

for(char ch ='a'; ch<='z'; ch++){

    sb.append(ch);
}
sb.toString();
System.out.print(sb+" ");

    }
}
