package ArrayList;
import java.util.*;

public class sortedRotatedArray {
    public static boolean pairSum2(ArrayList<Integer>ls, int target){

        int bp = -1;
        int n = ls.size();
    
        for(int i=0; i<ls.size(); i++){
            if(ls.get(i) > ls.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        while(lp != rp){
            if(ls.get(lp) + ls.get(rp) == target){
                return true;
            }

            if(ls.get(lp) + ls.get(rp) < target){
                lp = (lp+1) % n;
            }else{
                rp = (n + rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        height.add(10);
        int target = 20;
System.out.println(pairSum2(height, target));
    }
}
