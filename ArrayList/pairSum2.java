package ArrayList;

import java.util.ArrayList;

public class pairSum2 {

    public static boolean pairSumSortedRoated(ArrayList<Integer>list, int target){

        int bp = -1;
        int lp = 0; 
        int rp = list.size()-1;
        int n = list.size();

        for(int i=0; i<list.size(); i++){
            if(list.get(lp) > list.get(rp) ){
                bp = i;
                break;
            }
        }

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            if(list.get(lp ) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }else{
                rp = (n+rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 25;
        System.out.println(pairSumSortedRoated(list, target));

    }
}
