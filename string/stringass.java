import java.util.Arrays;
import java.util.HashMap;

public class stringass {

    // public static boolean isVowel(char ch){
    //     if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
    //         return true;
    //     }else {
    //         return false;
    //     }
    // }
    // public static int countVowel(String name){

    //     int n = name.length();
    //     int count =0;

    //     for(int i=0; i<n; i++){
    //         if(isVowel(name.charAt(i))){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args){
    //     String name = "aeroplane";
    //     System.out.println(countVowel(name));
    // }
    




    // public static void main(String[] args){
    //     String str = "ShradhaDidi";
    //     String str1 = "ApnaCollege";
    //     String str2 = "ShradhaDidi";

    //     System.out.println(str.equals(str1) + " " + str.equals(str2));
    //     String str3 = "AppnaCollege".replace("l", " ");
    //     System.out.println(str3);
    // }


    // public static boolean isanagram(String s, String t){
    //     if(s.length() != t.length()){
    //         return false;

    //     }

    //     HashMap<Character, Integer>m1 = new HashMap<>();
    //     HashMap<Character, Integer>m2 = new HashMap<>();

    //     for(int i=0; i<s.length(); i++){
    //         m1.put(s.charAt(i), m1.getOrDefault(m1, 0)+1);
    //         m2.put(t.charAt(i), m2.getOrDefault(m2, 0)+1);
    //     }
    //     return m1.equals(m2);
    // }


    // public static void main(String[] args){
    //     String s ="listen";
    //     String t = "linkeu";

    //     System.out.println(isanagram(s, t));
    // }



    public static boolean isanagram(String s, String t){
       s.toCharArray();
       t.toCharArray();

        if(s.length() != t.length()){
            return false;
        }
       char[] a = s.toCharArray();
       char[] b = t.toCharArray();

       Arrays.sort(a);
       Arrays.sort(b);


       return Arrays.equals(a, b);

    }

    public static void main(String[] args) {
        String str = "listen";
        String str1 = "silent";

        System.out.println(isanagram(str, str1));
    }
}
