import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        for(int i=0; i<ls.size(); i++){
         System.err.println(ls.get(i));   
        }
        ls.remove(3);
         for(int i=0; i<ls.size(); i++){
         System.err.println(ls.get(i));   
        }

        ls.set(1, 100);
        System.out.println(ls.get(1));
    System.out.println(ls.contains(30));    
    System.out.println(ls.contains(4000));
    ls.add(1, 70);
    System.out.println(ls);
    

    }
}
