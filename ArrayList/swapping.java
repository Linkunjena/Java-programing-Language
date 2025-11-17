package ArrayList;

import java.util.ArrayList;



public class swapping {

    public static void swapNum(ArrayList<Integer>ls , int idx1, int idx2){

        int temp = ls.get(idx1);
        ls.set(idx1, idx2);
        ls.set(idx2, temp);
    }
   public static void main(String[] args) {
    ArrayList<Integer>ls = new ArrayList<>();
    ls.add(2);
    ls.add(5);
    ls.add(9);
    ls.add(3);
    ls.add(6);
    System.out.println(ls);
     
    int idx1 = 1, idx2 = 3;


    swapNum(ls, idx1, idx2);
    System.out.println(ls);
   }
}
