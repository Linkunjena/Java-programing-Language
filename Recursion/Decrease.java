package Recursion;

public class Decrease {

    public static void DecreaseOrd(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        DecreaseOrd(n-1);
    }
    public static void main(String[] args) {
        DecreaseOrd(10);
    }
}
