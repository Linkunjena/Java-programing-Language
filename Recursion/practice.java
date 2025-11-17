public class practice {
    public static int tilling(int n){
if(n==1 || n==0){
    return 1;
}
  int fnm = tilling(n-1);
       int fnm2 = tilling(n-2);
       int totalway = fnm + fnm2;

       return totalway;
    }
    public static void main(String[] args) {
        System.out.println(tilling(10));
    }
}
