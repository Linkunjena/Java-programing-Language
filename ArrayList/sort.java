package ArrayList;

import java.util.ArrayList;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(9);
        ls.add(7);
        ls.add(6);
        ls.add(3);
        ls.add(2);
        ls.add(5);
        System.out.println(ls);

Collections.sort(ls);
System.out.println(ls);


Collections.sort(ls, Collections.reverseOrder());
System.out.println(ls);
    }
}
