public class practiceSection {
//     public static int  firstOccurance(int[] arr, int i, int key){

// if(i == arr.length-1){
//     return -1;
// }

//         if(arr[i] == key){
//             return i;
//         }
        

//      int ans=    firstOccurance(arr, i+1, key);
//        return ans;
//     }
//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 50, 60, 70};
//         int i= 0;
//         int key = 50;
//       System.out.println(firstOccurance(arr, i, key));
//     }


// public static int tillingfind(int num){
//     if(num == 0 || num == 1){
//         return 1;
//     }


//     int fn1 = tillingfind(num-1);
//     int fn2 = tillingfind(num-2);

//     int totalWays = fn1 + fn2;
//     return totalWays;
// }



// public static void main(String[] args){
//     int num = 5;
//   System.out.println(tillingfind(num));
// }


public static void Duplicate(String st , int i,StringBuilder str, boolean[] map){

    if(i == st.length()){
        System.out.println(str);
        return;
    }


    char ch = st.charAt(i);
    if(map[ch-'a'] == true){
        Duplicate(st, i+1, str, map);
    }else{
        map[ch-'a'] = true;
        Duplicate(st, i+1, str.append(ch), map);
    }
}

public static void main(String[] args) {
    String st = "apnnaCollege";
    int i =0;
    StringBuilder str = new StringBuilder("");
    boolean map[] = new boolean[26];
 Duplicate(st, i, str, map);
}
}
