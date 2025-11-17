public class tilling{
    public static int  tillingcount(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical
     int    fnm1 = tillingcount(n-1);
        // horizontal
    int fnm2 = tillingcount(n-2);

    int fn = fnm1 + fnm2;
    return fn;


    }
    public static void main(String[] args) {
        System.out.println(tillingcount(5));
    }
}