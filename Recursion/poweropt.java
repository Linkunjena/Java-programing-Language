package Recursion;

public class poweropt {
    public static int pow(int x, int n){
if(n==0){
    return 1;
}

        int fnm = pow(x, n/2);
       int  fn = fnm * fnm;

       if(n %2 != 0){
        return fn*x ;
       }
       return fn;
    }
    public static void main(String[] args){
        System.out.println(pow(2, 9));
    }
}
