package ArrayList;

import java.util.ArrayList;

public class findMax {
    public static void main(String[] args) {
         ArrayList<Integer>ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(8);
        ls.add(0);
        ls.add(7);


        int max = Integer.MAX_VALUE;

        for(int i=0; i<ls.size(); i++ ){
            if(max > ls.get(i)){
                max = ls.get(i);
            }
        }
        System.out.println("The maximum is element is: "+ max);
    }
}
