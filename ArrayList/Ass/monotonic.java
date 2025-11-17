package ArrayList.Ass;
import java.util.*;

public class monotonic {
    public static boolean checkMonotonic(ArrayList<Integer>ls){
        boolean increase = true;
        boolean decrease = true;

        for(int i=0; i<ls.size()-1; i++){
            if(ls.get(i) > ls.get(i+1)){
                increase = false;
            }

            if(ls.get(i) < ls.get(i+1)){
                decrease = false;
            }
        }
        return increase || decrease;
    }
    public static void main(String[] args) {
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(2);
        

        System.out.println(checkMonotonic(ls));
    }
}
