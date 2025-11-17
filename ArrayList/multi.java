package ArrayList;

import java.util.ArrayList;

public class multi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();

        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(5); 
        ls.add(10);
        ls.add(15);
        System.out.println(ls);
        mainList.add(ls);

        ArrayList<Integer>ls2 = new ArrayList<>();
        ls2.add(100);
        ls2.add(200);
        ls2.add(300);
        System.out.println(ls2);
        mainList.add(ls2);

        System.out.println(mainList);



        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }


       ArrayList<ArrayList<Integer>> list = new ArrayList<>();

       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       ArrayList<Integer>list3 = new ArrayList<>();

       for(int i=1; i<=5; i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
       }

       list.add(list1);
       list.add(list2);
       list.add(list3);


      System.out.println(list);
    }
}
