public class calculatesum {

    public static int sum(int n){

        if(n==1){
            return 1;
        }


        int snm1 = sum(n-1);
        int sn = snm1 +n;
        return sn ;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    
}
