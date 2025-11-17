package ArrayList;

import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        System.out.println(ls);

        for(int i=ls.size()-1; i>=0; i--){
            System.out.print(ls.get(i)+" ");
        }
        System.out.println();
    }
}
