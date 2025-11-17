package ArrayList;

import java.util.ArrayList;
//this is Brute force approach in this problem solve

public class container {
    public static int  mostWater(ArrayList<Integer>ls){
        int maxWater = 0;

        for(int i=0; i<ls.size(); i++){
for(int j=0; j<ls.size(); j++){
    int height = Math.min(ls.get(i), ls.get(j));
    int width = j-i;
    int currWater = height * width;

    maxWater = Math.max(maxWater, currWater);
    
}
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(1);
        ls.add(8);
        ls.add(6);
        ls.add(2);
        ls.add(5);
        ls.add(4);
        ls.add(8);
        ls.add(3);
        ls.add(7);

      System.out.println( mostWater(ls)); 
    }
}
