package ArrayList;

import java.util.ArrayList;

public class container_two {

    public static int storeWater(ArrayList<Integer>ls){

        int lp = 0;
        int rp = ls.size()-1;
        int maxWater = 0;

        while (lp<rp) {
        int ht = Math.min(ls.get(lp), ls.get(rp));
        int width = rp - lp;

        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);

        if(ls.get(lp) < ls.get(rp)){
            lp++;
        }else{
            rp--;
        }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

      System.out.println( storeWater(height)); 
    }
}
