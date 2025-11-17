package ArrayList;

import java.util.ArrayList;

public class pairSum_twopointer {
    public static boolean findPairSum(ArrayList<Integer>ls,int  target){
        int lp = 0;
        int rp = ls.size()-1;

        while(lp != rp){
            if(ls.get(lp)+ ls.get(rp) == target){
                return true;
            }

            if(ls.get(lp) + ls.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
         list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;

        System.out.println(findPairSum(list, target));
    }
}
