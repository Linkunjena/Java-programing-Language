package Recursion;

public class Incord {
    public static void IncreaseOrd(int n){
if(n==1){
    System.out.print(n+ " ");
    return ;
}
        IncreaseOrd(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        IncreaseOrd(10);
    }
}
