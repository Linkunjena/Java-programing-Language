package bitManupulation;

public class update {
    public static int clearithbit(int n, int i){
        int newbit = ~(1<<i);
        return n & newbit;
    }
    public static int setbit(int n, int i){
        int newbit2 = 1<<i;
        return n | newbit2;
    }
    public static int updateithbit(int n, int i, int newbit){
        if(newbit == 0){
            return clearithbit(n, i);
        }else{
            return setbit(n, i);
        }
    }
    public static void main(String[] args){
        System.out.println(updateithbit(10, 2, 1));
    }
}
