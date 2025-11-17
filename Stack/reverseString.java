import java.util.Stack;

public class reverseString {

    public static String reverseAString(String str){

        Stack<Character>s = new Stack<>();
        int idx =0;


        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder st = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            st.append(curr);
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str = "Apnacollege";
        String ans = reverseAString(str);
        System.out.println(ans);
    }
}
