import java.util.Stack;

public class reveseAStack2 {
    public static void pushAtBottomIdx(Stack<Integer> s, int data){

if(s.isEmpty()){
    s.push(data);
    return;
}

        int top = s.pop();
        pushAtBottomIdx(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){

        if(s.isEmpty()){
           return;
        }


        int top = s.pop();
        reverse(s);
        pushAtBottomIdx(s, top);

    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);


        reverse(s);
        printStack(s);
    }
}
