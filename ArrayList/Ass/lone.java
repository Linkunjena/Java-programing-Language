package ArrayList.Ass;
import java.util.*;

public class lone {
    public static ArrayList<Integer> findlonely (ArrayList<Integer>ls){
        Collections.sort(ls);
        ArrayList<Integer>nums = new ArrayList<>();

        for(int i=1; i<ls.size()-1; i++){
            if(ls.get(i-1) + 1 < ls.get(i) && ls.get(i) + 1 < ls.get(i+1)){
                nums.add(i);
            }
        }

        if(ls.size()== 1){
            nums.add(0);
        }

        if(ls.size() > 1){
            if(ls.get(0) +1 < ls.get(1)){
                nums.add(ls.get(0));
            }

            if(ls.get(ls.size()-2) +1 < ls.get(ls.size()-1) ){
                nums.add(ls.get(ls.size()-1));
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findlonely(list));


    }
}
