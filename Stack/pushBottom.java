import java.util.Stack;


public class pushBottom {
    public static void addAtBottom(Stack<Integer>st, int data){
         if(st.isEmpty()){
            st.push(data);
            return;
         }


        int top = st.pop();
        addAtBottom(st, data);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        addAtBottom(st, 4);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
