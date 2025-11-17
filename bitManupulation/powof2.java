package bitManupulation;

public class powof2 {
    public static boolean checkpow(int n){
    return (n & (n-1)) ==0;
    }
    public static void main(String[] args) {
        System.out.println(checkpow(8));
    }
    
}
