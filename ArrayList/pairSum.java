package ArrayList;

import java.util.ArrayList;

public class pairSum {
    public static boolean findPairSum(ArrayList<Integer>ls, int target){

        for(int i=0; i<ls.size(); i++){
            for(int j=0; j<ls.size(); j++){
                if(ls.get(i) + ls.get(j)== target){
                    return true;
                }
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
        int target = 12;

        System.out.println(findPairSum(list, target));
    }
}
