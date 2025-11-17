package bitManupulation;

public class set {
    public static int setIthbit(int n, int i){

        int bitMask = 1<<i;

       return n| bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthbit(8, 2));
        
    }
}
