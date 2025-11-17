import java.util.*;

import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();

        }
    }
    
}
